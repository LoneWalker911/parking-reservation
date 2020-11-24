/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.*;
import java.util.Hashtable;

/**
 *
 * @author thisa/Prashan
 */
public class Slot {
    
    private int slot_id = 0;
    private String slot_name = null;
    private String slot_status = "";
    private final Connection con = dbConnection.CreateConn();;
    EventLog log = new EventLog();
    
    public boolean addSlot()
    {
        if(!(getSlot_name().equals("")) && getIdBySlotName(getSlot_name()) == 0)
        {
        try
        {
            setSlot_id(getLastid());
            String query = "INSERT INTO parking_slot VALUES (?, ?, ?)";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setInt (1, getSlot_id()+1);
            prest.setString (2, getSlot_name());
            prest.setString (3, getSlot_status());

            // execute the preparedstatement
            prest.execute();
            log.Write("Slot_ID : "+ Integer.toString(getSlot_id()) + " added to slots table.");

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
        if((slot_name!=null || slot_status != null) && slot_id != 0)
        {
        try
        {
            String update = "";
            if(slot_name != null && slot_status == null)
            {update = "name='"+slot_name+"'";}
            if(slot_name == null && slot_status != null)
            {update = "description='"+slot_status+"'";}
            if(slot_name != null && slot_status != null)
            {update = "name='"+slot_name+ "', "+ "description='"+slot_status+"'";}
            
            String query = "UPDATE roles SET "+ update + " WHERE id=" + Integer.toString(slot_id);

            Statement st = con.createStatement();
            st.executeUpdate(query);
 
            
            log.Write("Roles_ID : "+ Integer.toString(slot_id) + " updated "+ update +" on roles table.");

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
        
        String sql = "SELECT id FROM parking_slot WHERE id = (SELECT MAX(id) FROM parking_slot)";
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
    
    public int getIdBySlotName(String name)
    {
        int id = 0;
        String sql;
        sql = "SELECT id FROM parking_slots WHERE name='"+name+"'";

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
     * @return the slot_id
     */
    public int getSlot_id() {
        return slot_id;
    }

    /**
     * @param slot_id the slot_id to set
     */
    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    /**
     * @return the role_title
     */
    public String getSlot_name() {
        return slot_name;
    }

    /**
     * @param role_title the role_title to set
     */
    public void setSlot_name(String slot_name) {
        this.slot_name = slot_name;
    }

    /**
     * @return the slot_status
     */
    public String getSlot_status() {
        return slot_status;
    }

    /**
     * @param slot_status the slot_status to set
     */
    public void setSlot_status(String slot_status) {
        this.slot_status = slot_status;
    }
    
    
    
    
}
