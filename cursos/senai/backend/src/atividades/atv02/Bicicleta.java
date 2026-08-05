package atividades.atv01;

public class Bicicleta {
    public String modelo;
    public String marca;
    public int ano;
    public int totalMarcha;
    public String cor;
    public double tamanhoAro;

    public Bicicleta(String modelo, String marca, int ano, int totalMarcha, String cor, double tamanhoAro) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.totalMarcha = totalMarcha;
        this.cor = cor;
        this.tamanhoAro = tamanhoAro;
    }

    public String pedalar(){
        return "Pedalando";
    }

    public String trocarMarcha(){
        return "Trocando marcha";
    }

    public String parar(){
        return "Parar bicicleta";
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", totalMarcha=" + totalMarcha +
                ", cor='" + cor + '\'' +
                ", tamanhoAro=" + tamanhoAro +
                '}';
    }
}
