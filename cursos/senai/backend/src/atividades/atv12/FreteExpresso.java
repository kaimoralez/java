package atividades.atv12;

public class FreteExpresso extends Frete{

    private double taxaFixa = 15.00;
    private double adicional = 1.30;

    public FreteExpresso(double peso, double taxa){
        super (peso,taxa);
    }

    public double getTaxaFixa(){
        return taxaFixa;
    }

    public double getAdicional() {
        return adicional;
    }

    @Override
    public double calcularFrete() {
        return (getPeso() * getTaxa()) * adicional + taxaFixa ;
    }
}
