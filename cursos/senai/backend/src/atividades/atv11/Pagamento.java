package atividades.atv11;

public abstract class Pagamento {
    private double valor;
    private int id;
    private boolean aprovado;

    public Pagamento(double valor, int id){

        if(valor <= 0){
            throw new IllegalArgumentException("Valor insifuciente");
        }
        this.valor = valor;
        this.id = id;
    }

    public double getValor(){
        return valor;
    }

    public boolean getAprovado(){
        return aprovado;
    }

    public int getId() {
        return id;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public abstract void processar();

}