/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;


import java.io.Serializable;
import java.lang.annotation.Annotation;

/**
 *
 * @author ASUS
 */
public  class RecClass implements Serializable {
    public String name,choice,info;

    public RecClass() {
    }

    public RecClass(String name, String choice, String info) {
        this.name = name;
        this.choice = choice;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "RecClass\n" + "\n name=" + name + "\n choice=" + choice + "\n info=" + info + '\n';
    }
    
}
