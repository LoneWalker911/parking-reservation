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
    
    public boolean updateSlot()
    {
        if(slot_status != null && slot_id != 0)
        {
        try
        {
            String query = "UPDATE roles SET status='" + getSlot_status() + "WHERE id="+getSlot_id();

            Statement st = con.createStatement();
            st.executeUpdate(query);
 
            
            EventLog.Write("Slot_ID : "+ getSlot_id() + " updated to '" + getSlot_status() + "'.");

            return true;
        }
        catch (SQLException e)
            {
              EventLog.Write("updateSlot Exception :"+e.getMessage());
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
    
    public String getStatusById(String id)
    {
        String sql;
        sql = "SELECT status FROM parking_slot WHERE id="+id;

        try{

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
          {
            return rs.getString("status");       
          }
          return "";
        }
        catch (SQLException e)
            {
              System.err.println("GetRole id Got an exception!+\n"+ sql );
              System.err.println(e.getMessage());
              return "";
            }
      
      
    }
    
    public String[] getStatus()
    {
        String sql = "SELECT status FROM parking_slot ORDER BY id ASC";
        String res[] = new String[15];

        try{

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            int i = 0;

            while(rs.next()) {
                res[i] = rs.getString("status");
                i++;
            }
            return res;
        }
        catch (SQLException e)
            {
              EventLog.Write("Slot.getStatus Exception: "+e.getMessage());
              return null;
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
