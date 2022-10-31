package CEscola;

import java.io.Serializable;

public class Aluno implements Serializable{
    private String nome;
    private String password;
    private String n_escola;

    public Aluno(String nome, String password, String n_escola) {
        this.nome = nome;
        this.password = password;
        this.n_escola = n_escola;
    }
    @Override
    public String toString(){
        return "Aluno("+
                "nome='"+nome+'\''+
                ", password='"+password +'\''+
                ", n_escola='"+n_escola+'\''+
                ')';

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getN_escola() {
        return n_escola;
    }

    public void setN_escola(String n_escola) {
        this.n_escola = n_escola;
    }
    
}