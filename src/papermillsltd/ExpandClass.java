/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

/**
 *
 * @author ASUS
 */
public class ExpandClass {
    public String name, number, address;

    public ExpandClass() {
    }

    public ExpandClass(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ExpandClass{\n" + "name=" + name +"\n" + ", number=" + number +"\n"+ ", address=" + address+"\n" + '}';
    }
    
    
}
