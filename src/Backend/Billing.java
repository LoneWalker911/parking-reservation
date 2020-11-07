/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Prashan
 */
public class Billing {
    
    private String Vehicle_des;
    private int orderID;
    
    /**
     * @return the Vehicle_des
     */
    public String getVehicle_des() {
        return Vehicle_des;
    }

    /**
     * @param Vehicle_des the Vehicle_des to set
     */
    public void setVehicle_des(String Vehicle_des) {
        this.Vehicle_des = Vehicle_des;
    }

    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    
            dbConnection db = new dbConnection();
            Connection con = db.CreateConn();
            
    public double CalculateBill (int OrderID, String Vehicle_des ) {
        try {
            String query = "SELECT orders.duration, fee.fee FROM orders,fee WHERE orders.id='OrderID' AND fee.fee_description='Vehicle_des";
            Statement st = con.createStatement();
            ResultSet results = st.executeQuery(query);

            while (results.next()) {
            String  duration = results.getString("duration");
            String fee =  results.getString("fee");

            double d = Double.parseDouble(duration);
            double f = Double.parseDouble(fee);
            
            double total = d * f;
            
            return total;
            
        }} catch (SQLException sql) {

            System.out.println(sql);
        }
        return 0;

            
        
                 
    }
}
         

    

