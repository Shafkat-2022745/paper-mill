/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Shanto
 */
public class Employee {
        private SimpleStringProperty name, degicnation,assignResponsibilities;
        
    public Employee(String name, String degicnation, String assignResponsibilities) {
    this.name = new SimpleStringProperty(name);
    this.degicnation = new SimpleStringProperty(degicnation);
    this.assignResponsibilities = new SimpleStringProperty(assignResponsibilities);
}

public void setName(String name) {
    this.name = new SimpleStringProperty(name);
}

public void setDesignation(String degicnation) {
    this.degicnation = new SimpleStringProperty(degicnation);
}

public void setAssignedResponsibilities(String assignResponsibilities) {
    this.assignResponsibilities = new SimpleStringProperty(assignResponsibilities);
}

public String getName() {
    return name.get();
}

public String getDegicnation() {
    return degicnation.get();
}

public String getAssignResponsibilities() {
    return assignResponsibilities.get();
}    

    void setAssignResposibilityes(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
