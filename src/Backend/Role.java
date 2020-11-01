/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.*;

/**
 *
 * @author Prashan
 */
public class Role {
    
    private int role_id;
    private String role_title;
    private String role_des;
    dbConnection db = new dbConnection();
    private final Connection con = db.CreateConn();
    EventLog log = new EventLog();
    
    public boolean addRole(String name, String desc)
    {
        try
        {
            int id = getLastid();
            String query = "INSERT INTO roles "
                         + " values (?, ?, ?)";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setInt (1, id+1);
            prest.setString (2, name);
            prest.setString (3, desc);

            // execute the preparedstatement
            prest.execute();
            log.Write("Roles_ID : "+ Integer.toString(id+1) + " added to roles table.");

            return true;
        }
        catch (SQLException e)
            {
              System.err.println("Got an exception!");
              System.err.println(e.getMessage());
              return false;
            }
    }
    
    public int getLastid() throws SQLException
    {
        int id = -1;
        
        String sql = "SELECT id FROM roles WHERE id = (SELECT MAX(id) FROM roles)";
        
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

    /**
     * @return the role_title
     */
    public String getRole_title() {
        return role_title;
    }

    /**
     * @param role_title the role_title to set
     */
    public void setRole_title(String role_title) {
        this.role_title = role_title;
    }

    /**
     * @return the role_des
     */
    public String getRole_des() {
        return role_des;
    }

    /**
     * @param role_des the role_des to set
     */
    public void setRole_des(String role_des) {
        this.role_des = role_des;
    }
    
    
    
    
}
