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
public class Login {
    private String login_id;
    private String password;

    /**
     * @return the login_id
     */
    public String getLogin_id() {
        return login_id;
    }

    /**
     * @param login_id the login_id to set
     */
    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
            dbConnection db = new dbConnection();
            Connection con = db.CreateConn();
            
            public void displayUsers(String login_id, String password) {
        try {
            String query = "SELECT user_id, pwd FROM login";
            Statement st = con.createStatement();
            ResultSet results = st.executeQuery(query);

            while (results.next()) {
            String user_id = results.getString("user_id");
            String pwd =  results.getString("pwd");

               if ((login_id.equals(user_id)) && (password.equals(pwd))) {

                   System.out.println("Username and Password exist");  
            }else {

                   System.out.println("Please Check Username and Password");
            }
            results.close();
        }} catch (SQLException sql) {

            System.out.println(sql);
        }
            
          
                 
            
            
        
    
    
}}
