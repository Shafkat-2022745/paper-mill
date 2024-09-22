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
public class Stakeholder {
    public String stakeholder,relation;

    public Stakeholder() {
    }

    public Stakeholder(String stakeholder, String relation) {
        this.stakeholder = stakeholder;
        this.relation = relation;
    }

    public String getStakeholder() {
        return stakeholder;
    }

    public void setStakeholder(String stakeholder) {
        this.stakeholder = stakeholder;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return  "stakeholder=" + stakeholder + "\n relation=" + relation + "\n\n";
    }
    
    
}
