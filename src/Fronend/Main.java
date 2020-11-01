/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fronend;
import Backend.Role;
import java.sql.SQLException;

/**
 *
 * @author thisa
 */
public class Main {
    public static void main(String[] args) {
        Role rl = new Role();
        try{
            rl.addRole("admin", "can access all the functions");
            System.out.println(rl.getLastid());
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        
    }
    
}
