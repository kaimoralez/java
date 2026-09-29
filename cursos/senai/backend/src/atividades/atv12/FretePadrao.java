package atividades.atv12;

public class FretePadrao extends Frete{


    public FretePadrao(double peso, double taxa){
        super(peso, taxa);

    }


    @Override
    public double calcularFrete() {
        return getPeso()*getTaxa();
    }
}
