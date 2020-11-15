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

/**
 *
 * @author thisa
 */


public class Staff {
    public Staff(){}
    
    private int user_id=0;
    private String name=null;
    private String email=null;
    private String mobile=null;
    private String address=null;

    private final Connection con = dbConnection.CreateConn();
    EventLog log = new EventLog();
    
    public int addStaff()
    {
        if(getName()!=null && getEmail()!=null && getMobile()!=null && getAddress()!=null)
        {
            int id = getLastid()+1;
        try
        {       
            String query = "INSERT INTO staff "
                         + " values (?,?, ?, ?, ?)";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setInt (1, id);
            prest.setString (2, name);
            prest.setString (3, address);
            prest.setString (4, email);
            prest.setString (5, mobile);

            // execute the preparedstatement
            prest.execute();
            id=getLastid();
            EventLog.Write("Staff_ID : "+ id + " added to staff table.");

            return id;
        }
        catch (SQLException e)
            {
              System.err.println("addStaff Got an exception!");
              System.err.println(e.toString());
              return 0;
            }
        }
        else return 0;
    }
    
    public int getLastid() 
    {
        int id = 0;
        
        String sql = "SELECT id FROM staff WHERE id = (SELECT MAX(id) FROM staff)";
        try{
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        
        
        while (rs.next())
            {
              id = rs.getInt("id");       
            }
        st.close();
        }
        catch(SQLException e)
        {
            EventLog.Write("Exception : "+e.getMessage());
        }
        return id;
    }
    
    public boolean isStaffIdExists(int id) throws SQLException
    {
        String sql = "SELECT id FROM staff WHERE id="+id;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        return rs.next();
    }


    public int getUser_id() {
        return user_id;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
       
}
