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
public class Quality {
    public String rawname, type, code;

    public Quality() {
    }

    public Quality(String rawname, String type, String code) {
        this.rawname = rawname;
        this.type = type;
        this.code = code;
    }

    public String getRawname() {
        return rawname;
    }

    public void setRawname(String rawname) {
        this.rawname = rawname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Quality\n" + "\n rawname=" + rawname + "\n type=" + type + "\n code=" + code + '\n';
    }
    
    
}
