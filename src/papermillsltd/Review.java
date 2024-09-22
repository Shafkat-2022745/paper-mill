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
public class Review implements Serializable {
    public String name,review;

    public Review() {
    }

    public Review(String name, String review) {
        this.name = name;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return  "name=" + name + "\nreview=" + review + "\n\n";
    }
    
    
}
