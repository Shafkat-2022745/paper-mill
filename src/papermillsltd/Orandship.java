/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class Orandship {
    
    public String name, prodcut,address, price;
    public LocalDate date;

    public Orandship() {
    }

    public Orandship(String name, String prodcut, String address, String price, LocalDate date) {
        this.name = name;
        this.prodcut = prodcut;
        this.address = address;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdcut() {
        return prodcut;
    }

    public void setProdcut(String prodcut) {
        this.prodcut = prodcut;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Orandshi\n{" + "\n name=" + name + "\n prodcut=" + prodcut + "\n address=" + address + "\n price=" + price + "\n date=" + date + '\n';
    }
    
    
}
