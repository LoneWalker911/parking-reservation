/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.*;

/**
 *
 * @author thisa/Prashan
 */
public class Role {
    
    private int role_id = 0;
    private String role_name = null;
    private String role_des = null;
    private final Connection con = dbConnection.CreateConn();;
    EventLog log = new EventLog();
    
    public Role(){};
    
    public Role(String name,String des)
    {
        role_name = name;
        role_des = des;
    }
    
    public String[] getRoles()
    {
        try
        {
            String query = "SELECT name FROM roles";
            String res[] = new String[10];

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            int i = 0;

            while(rs.next()) {
                res[i] = rs.getString("name");
                i++;
            }
            return res;
        }
        catch (SQLException e)
            {
              System.err.println("Got an exception!");
              System.err.println(e.getMessage());
              return null;
            }
    }
    
    public boolean updateRole()
    {
        if((role_name!=null || role_des != null) && role_id != 0)
        {
        try
        {
            String update = "";
            if(role_name != null && role_des == null)
            {update = "name='"+role_name+"'";}
            if(role_name == null && role_des != null)
            {update = "description='"+role_des+"'";}
            if(role_name != null && role_des != null)
            {update = "name='"+role_name+ "', "+ "description='"+role_des+"'";}
            
            String query = "UPDATE roles SET "+ update + " WHERE id=" + Integer.toString(role_id);

            Statement st = con.createStatement();
            st.executeUpdate(query);
 
            
            log.Write("Roles_ID : "+ Integer.toString(role_id) + " updated "+ update +" on roles table.");

            return true;
        }
        catch (SQLException e)
            {
              System.err.println("Got an exception!");
              System.err.println(e.getMessage());
              return false;
            }
        }
        else return false;
    }
    
    public int getLastid()
    {
        int id = 0;
        
        String sql = "SELECT id FROM roles WHERE id = (SELECT MAX(id) FROM roles)";
        try{
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next())
      {
        id = rs.getInt("id");       
      }
      }
        catch(SQLException e)
        {
            EventLog.Write("Exception : " + e.getMessage());
            System.out.println(e.toString());
        }
      
      return id;
    }
    
    public int getId(String name)
    {
        int id = 0;
        String sql;
        sql = "SELECT id FROM roles WHERE name="+"'"+name+"'";

        try{

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
          {
            id = rs.getInt("id");       
          }
          return id;
        }
        catch (SQLException e)
            {
              System.err.println("GetRole id Got an exception!+\n"+ sql );
              System.err.println(e.getMessage());
              return id;
            }
      
      
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
    public String getRole_name() {
        return role_name;
    }

    /**
     * @param role_title the role_title to set
     */
    public void setRole_name(String role_title) {
        this.role_name = role_title;
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
