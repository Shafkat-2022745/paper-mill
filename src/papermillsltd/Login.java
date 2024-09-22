/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

/**
 *
 * @author Shanto
 */
public class Login {
    private String id;
    private String password;
    private String type;

    public Login(String id, String password, String type) {
        this.id = id;
        this.password = password;
        this.type = type;
    }

    @Override
    public String toString() {
        return id + "#" + password + "#" + type;
    }

    public Login(){
        
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
