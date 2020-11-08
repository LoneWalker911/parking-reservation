/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.Random;

/**
 *
 * @author Prashan
 */
public class Login {
    private String username="";
    private String password="";
    private int staff_id=0;
    private int role_id=0;

    

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    EventLog log = new EventLog();
    dbConnection db = new dbConnection();
    Connection con = db.CreateConn();
    Staff stf = new Staff();
    
    public String Login() throws SQLException
    {
        String sql = "SELECT roles.name FROM login,roles WHERE login.username='" + getUsername() + "' AND login.password='" + getPassword() +"' AND login.role_id = roles.id";
        
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next())
      {
        String ret = rs.getString("name"); 
        st.close();
        return ret;
      }
      
      
      return "";
    
    }
            
    public void displayUsers(String login_id, String password) {
        try {
            String query = "SELECT user_id, pwd FROM login";
            Statement st = con.createStatement();
            ResultSet results = st.executeQuery(query);

            while (results.next()) {
            String user_id = results.getString("user_id");
            String pwd =  results.getString("pwd");

               if ((login_id.equals(user_id)) && (password.equals(pwd))) {

                   System.out.println("Username and Password exist");  
            }else {

                   System.out.println("Please Check Username and Password");
            }
            results.close();
        }} catch (SQLException sql) {

            System.out.println(sql);
        }
    }
    
    public Hashtable<String, String> CreateLogin() throws SQLException{
        
        Hashtable<String, String> loginDetails = null;
        if(!(username=="" || staff_id==0 || role_id==0))
      {
       if(!isUsernameStaffExists(username,staff_id) && stf.isStaffIdExists(staff_id))
       {
           
            loginDetails = new Hashtable<>();
            Random random = new Random();
            int aLimit = 97; // limit to 'a'
            int zLimit = 122; // limit to 'z'
            int StringLength = 8;
            StringBuilder buffer = new StringBuilder(StringLength);
            for (int i = 0; i < StringLength; i++) {
                int randomLimitedInt = aLimit + (int) 
                  (random.nextFloat() * (zLimit - aLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            String generatedPsw = buffer.toString();

           
        String sql = "INSERT INTO login(role_id,staff_id,username,password) VALUES (?, ?, ?, ?)";
        
        //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setInt (1, role_id);
            prest.setInt (2, staff_id);
            prest.setString (3, username);
            prest.setString (4, generatedPsw);

            // execute the preparedstatement
            prest.execute();
            log.Write("Login_ID : "+ Integer.toString(getLastid()) + " added to login table.");
            
            loginDetails.clear();
            loginDetails.put("username", username);
            loginDetails.put("password", generatedPsw);
            
            
       }}
       return loginDetails;
        
    } 
    
    public boolean isUsernameStaffExists(String username,int staff_id) throws SQLException
    {
        String sql = "SELECT id FROM login WHERE username='"+username+"' OR staff_id='"+ staff_id +"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        return rs.next();
    }
    
    public int getLastid() throws SQLException
    {
        int id = -1;
        
        String sql = "SELECT id FROM login WHERE id = (SELECT MAX(id) FROM login)";
        
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next())
      {
        id = rs.getInt("id");       
      }
      st.close();
      
      return id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
