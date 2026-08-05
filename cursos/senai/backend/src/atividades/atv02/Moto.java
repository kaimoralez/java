package atividades.atv01;

public class Moto {
    public String modelo;
    public String marca;
    public int ano;
    public String cor;
    public int cilindrada;

    public Moto(String modelo, String marca, int ano, String cor, int cilindrada) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.cilindrada = cilindrada;
    }

    public String frear(){
        return "Moto freando";
    }

    public String abastecer(){
        return "Abastecendo moto";
    }

    public String trocarMarcha(){
        return "Trocando marcha da moto";
    }



    @Override
    public String toString() {
        return "Moto{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }
}
