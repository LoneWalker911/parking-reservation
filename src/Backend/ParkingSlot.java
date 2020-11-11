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
public class ParkingSlot {
    
    private int id;
    private String description;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
              dbConnection db = new dbConnection();
              Connection con = db.CreateConn();
              
              public void SlotsInput(int id,String description)
              {
                  try {
            String query = "INSERT INTO 'parking_slot'(id, description) VALUE ('"+id+"'+'"+description+"'); ";
   
            Statement st = con.createStatement();
            ResultSet results = st.executeQuery(query);

                  }
                  
                  catch (SQLException sql){
                      System.out.println("sql");
            
                    }
             }
              
              
             public void SlotsUpdate(int id,String description)
              {
                  try {
            String query = "UPDATE 'parking_slot'(id, description) SET id= '"+id+"', description = '"+description+"' WHERE id = '"+id+"' ";
   
            Statement st = con.createStatement();
            ResultSet results = st.executeQuery(query);

                  }
                  
                  catch (SQLException sql){
                      System.out.println("sql");
            
                    }
             }
              
             
              public void SlotsDelete(int id,String description)
              {
                  try {
            String query = "UPDATE 'parking_slot'(description) description = 'Removed' WHERE id = '"+id+"' ";
   
            Statement st = con.createStatement(); 
            ResultSet results = st.executeQuery(query);

                  }
                  
                  catch (SQLException sql){
                      System.out.println("sql");
            
                    }
             }
             
     
}

              

