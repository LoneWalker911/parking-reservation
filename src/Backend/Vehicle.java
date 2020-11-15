/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Fronend.MessageBox;
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
    private int vehicle_id;
    private int vehicle_ownerid=0;
    private String vehicle_num="";
    private String type="";
    
    private final Connection con = dbConnection.CreateConn();
    
    public Vehicle(int cus_id){
    
} 

//    public int addVehicle()
//    {
//        if(getVehicle_ownerid()!=0 && !getVehicle_num().equals("") && !getType().equals(""))
//        {
//            int id = getLastid()+1;
//        try
//        {       
//            String query = "INSERT INTO vehicles "
//                         + " values (?,?, ?, ?, ?)";
//
//            //using a prepared statement to preven SQL Injection and other simillar attacks
//            PreparedStatement prest = con.prepareStatement(query);
//            prest.setInt (1, id);
//            prest.setString (1, name);
//            prest.setString (2, address);
//            prest.setString (3, email);
//            prest.setString (4, mobile);
//
//            // execute the preparedstatement
//            prest.execute();
//            id=getLastid();
//            EventLog.Write("Staff_ID : "+ id + " added to staff table.");
//
//            return id;
//        }
//        catch (SQLException e)
//            {
//              System.err.println("addStaff Got an exception!");
//              System.err.println(e.toString());
//              return 0;
//            }
//        }
//        else return 0;
//    }
    
    
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
    
}
