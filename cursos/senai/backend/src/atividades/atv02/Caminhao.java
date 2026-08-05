package atividades.atv01;

public class Caminhao {
    public String modelo;
    public String marca;
    public int ano;
    public String cor;
    public double capacidadeCargaKg;

    public Caminhao(String modelo, String marca, int ano, String cor, double capacidadeCargaKg) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public String carregarCarga(){
        return "Carregando carga";
    }

    public String estacionar(){
        return "Estacionando caminhão";
    }

    public String descarregarCarga(){
        return "Descarregando caminhão";
    }



    @Override
    public String toString() {
        return "Caminhao{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", capacidadeCargaKg=" + capacidadeCargaKg +
                '}';
    }
}



