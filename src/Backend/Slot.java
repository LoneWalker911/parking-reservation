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
public class Slot {
    
    private int slot_id = 0;
    private String slot_status = "";
    private final Connection con = dbConnection.CreateConn();
    
    
    public boolean updateSlot()
    {
        if(slot_status != null && slot_id != 0)
        {
        try
        {
            String query = "UPDATE parking_slot SET status='" + getSlot_status() + "' WHERE id="+getSlot_id();

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
