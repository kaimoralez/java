package atividades.atv11;

public class Cartao extends Pagamento {
    private double limiteDisponivel;

    public Cartao(double valor, int id, double limiteDisponivel){
        super(valor, id);
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public void processar() {
        if(limiteDisponivel >= getValor()){
            limiteDisponivel = limiteDisponivel - getValor();
            setAprovado(true);
        }else{
            setAprovado(false);
        }
    }

    public double getLimiteDisponivel(){
        return limiteDisponivel;
    }
}
