package atividades.atv12;

public class FreteInternacional extends Frete{
    private double taxaAlfandega;
    private double seguro;


    public FreteInternacional(double peso, double taxa, double taxaAlfandega, double seguro){
        super(peso, taxa);
        this.taxaAlfandega = taxaAlfandega;
        this.seguro = seguro;
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public double getSeguro() {
        return seguro;
    }

    @Override
    public double calcularFrete(){
        return ((getPeso()*getTaxa()) + taxaAlfandega + seguro);
    }
}
