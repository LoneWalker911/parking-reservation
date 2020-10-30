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
public class Parkingslot {
    private int slot_id;
    private String slot_des;
    private String slote_type;
    private int slot_carid;

    /**
     * @return the slot_id
     */
    public int getSlot_id() {
        return slot_id;
    }

    /**
     * @param slot_id the slot_id to set
     */
    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    /**
     * @return the slot_des
     */
    public String getSlot_des() {
        return slot_des;
    }

    /**
     * @param slot_des the slot_des to set
     */
    public void setSlot_des(String slot_des) {
        this.slot_des = slot_des;
    }

    /**
     * @return the slote_type
     */
    public String getSlote_type() {
        return slote_type;
    }

    /**
     * @param slote_type the slote_type to set
     */
    public void setSlote_type(String slote_type) {
        this.slote_type = slote_type;
    }

    /**
     * @return the slot_carid
     */
    public int getSlot_carid() {
        return slot_carid;
    }

    /**
     * @param slot_carid the slot_carid to set
     */
    public void setSlot_carid(int slot_carid) {
        this.slot_carid = slot_carid;
    }
}
