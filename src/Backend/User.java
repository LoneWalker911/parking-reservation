/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author thisa
 */
public class User {
    public User(){
        
}
    
    private int user_id;
    private int role_id;
    private String name;
    private String email;
    private String dob;
    private String address;


    public int getUser_id() {
        return user_id;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    public int getRole_id() {
        return role_id;
    }


    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getDob() {
        return dob;
    }


    public void setDob(String dob) {
        this.dob = dob;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }
    
    
    public boolean addUser(){
    return true;
    
    }
}
