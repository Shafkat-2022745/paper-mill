/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

/**
 *
 * @author Dell
 */
public class Member {
    
    private String name;
    private String id;
    private String dept;
    private String password;

    public Member() {
    }

    public Member(String name, String id, String dept, String password) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", id=" + id + ", dept=" + dept + ", password=" + password + '}';
    }
    
    
    
}
