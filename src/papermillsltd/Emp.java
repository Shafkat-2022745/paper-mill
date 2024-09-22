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
public class Emp implements Serializable{
    
    private String Name,ID,Performance;

    public Emp() {
    }

    public Emp(String Name, String ID, String Performance) {
        this.Name = Name;
        this.ID = ID;
        this.Performance = Performance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPerformance() {
        return Performance;
    }

    public void setPerformance(String Performance) {
        this.Performance = Performance;
    }

    @Override
    public String toString() {
        return "Emp{" + "Name=" + Name + ", ID=" + ID + ", Performance=" + Performance + '}';
    }
    
    
}
