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

    /**
     * @return the staff_id
     */
    public int getStaff_id() {
        return staff_id;
    }

    /**
     * @param staff_id the staff_id to set
     */
    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    /**
     * @return the role_id
     */
    public int getRole_id() {
        return role_id;
    }

    /**
     * @param role_id the role_id to set
     */
    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
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
    Connection con = dbConnection.CreateConn();
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
    
    public boolean CreateLogin(){
        
        boolean ret = false;
        try{
        if(!(username.equals("") || staff_id==0 || role_id==0))
      {
       if(!isUsernameStaffExists(username,staff_id) && stf.isStaffIdExists(getStaff_id()))
       {
           int id = getLastid()+1;

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

           
        String sql = "INSERT INTO login VALUES (?, ?, ?, ?, ?)";
        
        //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setInt (1, id);
            prest.setInt (2, getRole_id());
            prest.setInt (3, getStaff_id());
            prest.setString (4, username);
            prest.setString (5, generatedPsw);

            // execute the preparedstatement
            prest.execute();
            log.Write("Login_ID : "+ Integer.toString(getLastid()) + " added to login table.");
            ret = true;
            
            setPassword(generatedPsw);
            
            
       }}   return ret;
        }
        catch (SQLException e)
            {
              System.err.println("Create Login Got an exception!");
              System.err.println(e.toString());
              return ret;
            }
       
        
    } 
    
    public boolean isUsernameStaffExists(String username,int staff_id) throws SQLException
    {
        String sql = "SELECT id FROM login WHERE username='"+username+"' OR staff_id='"+ staff_id +"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        return rs.next();
    }
    
    public boolean changePassword(){
        String sql = "UPDATE login SET password= ? WHERE username= ? ";
        try{
        PreparedStatement preparedStmt = con.prepareStatement(sql);
        preparedStmt.setString(1, getPassword());
        preparedStmt.setString(2, getUsername());

        // execute the java preparedstatement
        preparedStmt.executeUpdate();
        return true;
    }
    catch(SQLException e)
    {
        System.out.println("changePsw error");
        EventLog.Write("Exception in Login.changePassword : "+e.getMessage());
        return false;
    }
    }
    
    public boolean isUsernameExists(String username)
    {
        String sql = "SELECT username FROM login WHERE username='" + username + "'";
        boolean ret = false;
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ret = rs.next();
        rs.close();
        st.close();
        return ret;
        }
        catch(SQLException e){
            EventLog.Write("Exception : "+e.getMessage());
        }
        return ret;
    }
    
    public int getLastid() throws SQLException
    {
        int id = 0;
        
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
