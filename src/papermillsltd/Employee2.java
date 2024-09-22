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
public class Employee2 implements Serializable{
     private String EmployeeName,ID,Address,Email,Designation,Gender,FatherName,Salary,Phone;

    public Employee2() {
    }

    public Employee2(String EmployeeName, String ID, String Address, String Email, String Designation, String Gender, String FatherName, String Salary, String Phone) {
        this.EmployeeName = EmployeeName;
        this.ID = ID;
        this.Address = Address;
        this.Email = Email;
        this.Designation = Designation;
        this.Gender = Gender;
        this.FatherName = FatherName;
        this.Salary = Salary;
        this.Phone = Phone;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String FatherName) {
        this.FatherName = FatherName;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return "Employee2{" + "EmployeeName=" + EmployeeName + ", ID=" + ID + ", Address=" + Address + ", Email=" + Email + ", Designation=" + Designation + ", Gender=" + Gender + ", FatherName=" + FatherName + ", Salary=" + Salary + ", Phone=" + Phone + '}';
    }
     
    
    
}
