package atividades.atv01;

public class Carro {

    public String modelo;
    public String marca;
    public int ano;
    public int portas;
    public String cor;

    public Carro(String modelo, String marca, int ano, int portas, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.portas = portas;
        this.cor = cor;
    }

    public String ligar(){
        return"Carro ligado";
    }

    public String desligar(){
        return"Carro desligado";
    }

    public String acelerar(){
        return"Carro acelerando";
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", portas=" + portas +
                ", cor='" + cor + '\'' +
                '}';
    }


}
