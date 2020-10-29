/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backend;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thisa
 */
public class Main{

    public static void main(String[] args){
        try {
            dbConnection db = new dbConnection();
            Connection con = db.CreateConn();
            
            String query = "CREATE TABLE customer (ID int(100) NOT NULL PRIMARY KEY)";
            
            Statement st = con.createStatement();
            st.executeUpdate(query); 
            
          
                
                System.out.println("TABLE CREATED.");
            
           } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}
