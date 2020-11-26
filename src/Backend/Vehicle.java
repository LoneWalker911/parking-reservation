/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Frontend.MessageBox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Prashan
 */
public class Vehicle {
    private int vehicle_id=0;
    private int vehicle_ownerid=0;
    private String vehicle_num="";
    private String type="";
    private String desc="";
    
    private final Connection con = dbConnection.CreateConn();
    

    public boolean addVehicle()
    {
        if(!(getVehicle_ownerid()==0 || getVehicle_num().equals("") || getType().equals("")))
        {
            int id = getLastid()+1;
        try
        {       
            String query = "INSERT INTO vehicles "
                         + " values (?,?, ?, ?, ?)";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setInt (1, id);
            prest.setInt (2, this.getVehicle_ownerid());
            prest.setString (3, this.getDesc());
            prest.setString (4, this.getType());
            prest.setString (5, this.getVehicle_num());

            // execute the preparedstatement
            prest.execute();
            id=getLastid();
            EventLog.Write("Staff_ID : "+ id + " added to staff table.");

            return true;
        }
        catch (SQLException e)
            {
              System.err.println("addStaff Got an exception!");
              System.err.println(e.toString());
              return false;
            }
        }
        else return false;
    }
    
    public boolean removeVehicle()
    {
        if(getVehicle_ownerid()!=0 && !(getVehicle_num().isEmpty()))
        {
            try
            {       
                String query = "DELETE FROM vehicles WHERE veh_owner_id = ? AND veh_number = ?";

                //using a prepared statement to preven SQL Injection and other simillar attacks
                PreparedStatement prest = con.prepareStatement(query);
                prest.setInt (1, getVehicle_ownerid());
                prest.setString (2, getVehicle_num());

                // prepared statement execution
                prest.executeUpdate();
                EventLog.Write("Veh_num : "+ getVehicle_num ()+" removed from customer id: "+getVehicle_ownerid()+".");

                return true;
            }
            catch (SQLException e)
            {
                  EventLog.Write("removeCustomer Exception : "+e.getMessage());
                  return false;
            }
        }
        else return false;
    }
    
    public int getLastid() 
    {
        int id = 0;
        
        String sql = "SELECT id FROM vehicles WHERE id = (SELECT MAX(id) FROM vehicles)";
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
            MessageBox.infoBox("Something went wrong", "Error");
        }
        return id;
    }
    
   public String[] getVehNumsFromCusId()
    {
        try
        {
            String query = "SELECT veh_number FROM vehicles WHERE veh_owner_id="+getVehicle_ownerid();
            String res[] = new String[20];

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            int i = 0;

            while(rs.next()) {
                res[i] = rs.getString("veh_number");
                i++;
            }
            return res;
        }
        catch (SQLException e)
            {
              EventLog.Write("Vehicle.getVehNumsFromCusId Exception: "+e.getMessage());
              return null;
            }
    } 
   
   public String getVehTypeFromId()
   {
       String res = "";
        try
        {
            String query = "SELECT veh_type FROM vehicles WHERE id="+getVehicle_id();

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            

            while(rs.next()) {
                res = rs.getString("veh_type");
            }
            return res;
        }
        catch (SQLException e)
            {
              EventLog.Write("Vehicle.getVehNumsFromCusId Exception: "+e.getMessage());
              return res;
            }
    } 
   
   public int getIdFromVehNum()
    {
        int id = 0;
        try
        {

            String query = "SELECT id FROM vehicles WHERE veh_number='"+getVehicle_num()+"'";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            

            while(rs.next()) {
                id = rs.getInt("id");
            }
            return id;
        }
        catch (SQLException e)
            {
              EventLog.Write("Vehicle.getIdFromVehNum Exception: "+e.getMessage());
              return id;
            }
    } 

    /**
     * @return the vehicle_id
     */
    public int getVehicle_id() {
        return vehicle_id;
    }

    /**
     * @param vehicle_id the vehicle_id to set
     */
    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    /**
     * @return the vehicle_ownerid
     */
    public int getVehicle_ownerid() {
        return vehicle_ownerid;
    }

    /**
     * @param vehicle_ownerid the vehicle_ownerid to set
     */
    public void setVehicle_ownerid(int vehicle_ownerid) {
        this.vehicle_ownerid = vehicle_ownerid;
    }

    /**
     * @return the vehicle_num
     */
    public String getVehicle_num() {
        return vehicle_num;
    }

    /**
     * @param vehicle_num the vehicle_num to set
     */
    public void setVehicle_num(String vehicle_num) {
        this.vehicle_num = vehicle_num;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
