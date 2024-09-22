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
public class AnaClass {
    public String size,type,idea;

    public AnaClass() {
    }

    public AnaClass(String size, String type, String idea) {
        this.size = size;
        this.type = type;
        this.idea = idea;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    @Override
    public String toString() {
        return "AnaClass{" + "size=" + size + ", type=" + type + ", idea=" + idea + '}';
    }
    
    
}
