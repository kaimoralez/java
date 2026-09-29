package atividades.atv12;

public abstract class Frete {

    private double peso;
    private double taxa;

    public Frete(double peso, double taxa){
        this.peso = peso;
        this.taxa = taxa;
    }

    public double getTaxa(){
        return taxa;
    }
    public double getPeso(){
        return peso;
    }

    public abstract double calcularFrete();
}

