package atividades.atv11;

public class Pix extends Pagamento{

    private double valorDisponivel;
    public Pix(double valor, int id, double valorDisponivel){
        super(valor, id);

        this.valorDisponivel = valorDisponivel;
    }

    @Override
    public void processar() {
        if(valorDisponivel >= getValor()){
            valorDisponivel = valorDisponivel - getValor();
            setAprovado(true);
        }else {
            setAprovado(false);
        }
    }
}

