/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Prashan
 */
public class Vehicle {
    private int vehicle_id;
    private int vehicle_ownerid;
    private String vehicle_num;
    private String type;

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
