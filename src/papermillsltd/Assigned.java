/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class Assigned implements Serializable   {
    public String name,ID,Duty;

    public Assigned() {
    }

    public Assigned(String name, String ID, String Duty) {
        this.name = name;
        this.ID = ID;
        this.Duty = Duty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDuty() {
        return Duty;
    }

    public void setDuty(String Duty) {
        this.Duty = Duty;
    }

    @Override
    public String toString() {
        return "Assigned\n" + "\n name=" + name + "\n ID=" + ID + "\n Duty=" + Duty + '\n';
    }
    
    
}
