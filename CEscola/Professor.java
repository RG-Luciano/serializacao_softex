package CEscola;

import java.io.Serializable;

public class Professor implements Serializable {
    private String nomep;
    private String passwordp;
    private String n_escolap;
    
    
    public Professor(String nomep, String passwordp, String n_escolap) {
        this.nomep = nomep;
        this.passwordp = passwordp;
        this.n_escolap = n_escolap;
    }
    @Override
    public String toString(){
        return "Professor("+
                "nome='"+nomep+'\''+
                ", password='"+passwordp+'\''+
                ", n_escola='"+n_escolap+'\''+
                ')';

    }
    public String getNomep() {
        return nomep;
    }
    public void setNomep(String nomep) {
        this.nomep = nomep;
    }
    public String getPasswordp() {
        return passwordp;
    }
    public void setPasswordp(String passwordp) {
        this.passwordp = passwordp;
    }
    public String getN_escolap() {
        return n_escolap;
    }
    public void setN_escolap(String n_escolap) {
        this.n_escolap = n_escolap;
    }
    
    
}