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
public class Backproc {
    
    public String name,address,method;

    public Backproc() {
    }

    public Backproc(String name, String address, String method) {
        this.name = name;
        this.address = address;
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Backproc\n" + "\n name=" + name + "\n address=" + address + "\n method=" + method + '\n';
    }
    
    
}
