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

    
            dbConnection db = new dbConnection();
            Connection con = db.CreateConn();
            
    public int CalculateBill (int duration, double fee) {
        try {
            String q1 = "SELECT duration FROM orders WHERE duration='duration'";
            String q2 = "SELECT fee FROM fee WHERE fee='fee'";
            Statement st = con.createStatement();
            ResultSet results = st.executeQuery(query);

            while (results.next()) {
            String user_id = results.getString("user_id");
            String pwd =  results.getString("pwd");

               if ((login_id.equals(user_id)) && (password.equals(pwd))) {

                   //System.out.println("Username and Password exist");  
                   return 1;
            }else {

                   //System.out.println("Please Check Username and Password");
                   return 0;
            }
            
        }} catch (SQLException sql) {

            System.out.println(sql);
        }
            
          
                 
            
         }

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
}
