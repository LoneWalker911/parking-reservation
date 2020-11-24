/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;
import Backend.*;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;

/**
 *
 * @author thisa
 */
public class Main {
    public static void main(String[] args) {
       
        Frontend.Staff.AddVehicle stf = new Frontend.Staff.AddVehicle(1);
        stf.setVisible(true);
//        try {
//  Desktop desktop = java.awt.Desktop.getDesktop();
//  URI oURL = new URI("http://www.google.com");
//  desktop.browse(oURL);
//} catch (IOException | URISyntaxException e) {
//}
        
        
        
        
    }
    
    
    
}
