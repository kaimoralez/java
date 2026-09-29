package atividades.atv11;

import java.time.LocalDate;

public class Boleto extends Pagamento {

    private LocalDate dataVencimento;

    public Boleto(double valor, int id) {
        super(valor, id);
        LocalDate hoje = LocalDate.now();
        this.dataVencimento = hoje.plusDays(3);
    }
    public LocalDate getDataVencimento(){
        return dataVencimento;
    }

    @Override
    public void processar() {
        setAprovado(false);
    }

}


