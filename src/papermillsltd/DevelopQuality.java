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
public class DevelopQuality {
    public String productName,quality;

    public DevelopQuality() {
    }

    public DevelopQuality(String productName, String quality) {
        this.productName = productName;
        this.quality = quality;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return  "productName= " + productName + "\n quality= " + quality + "\n\n";
    }
    
}
