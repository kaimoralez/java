package atividades.atv03;
import java.time.LocalDate;

public class Usuario {
    public String nome;
    public String senha;
    public LocalDate dtNasc;
    public String email;


    public Usuario(String nome, String senha, LocalDate dtNasc, String email){
        this.nome = nome;
        this.senha = senha;
        this.dtNasc = dtNasc;
        this.email = email;
    }

    public Usuario(String nome, String senha, String email ){
        this.nome = nome;
        this.senha = senha;
        this.email = senha;
    }


    public String login(){
        return "Login com sucesso";
    }
    public String logout(){
        return "Logout com sucesso";
    }

    @Override
    public String toString() {
        return "Usuario: " +
                "\n nome='" + nome + '\'' +
                "\n senha='" + senha + '\'' +
                "\n dtNasc=" + dtNasc +
                "\n email='" + email + '\'';
    }
}
