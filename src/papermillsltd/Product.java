/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class Product implements Serializable{
    private String name, price;
    private LocalDate mdate;

    public Product() {
    }

    public Product(String name, String price, LocalDate mdate) {
        this.name = name;
        this.price = price;
        this.mdate = mdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LocalDate getMdate() {
        return mdate;
    }

    public void setMdate(LocalDate mdate) {
        this.mdate = mdate;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", mdate=" + mdate + '}';
    }

    
    
    
}
