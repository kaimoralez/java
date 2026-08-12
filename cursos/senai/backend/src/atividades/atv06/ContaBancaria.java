package atv07;

public class ContaBancaria {
    private String titular;
    private double saldo = 0;
    private double limite;

    public ContaBancaria(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            return;
        } else {
            saldo = saldo + valor;
        }
    }

    public double sacar(double valor) {
        double total = saldo + limite;
        if (valor <= saldo){
            saldo = saldo - valor;
            return;
        } else if (valor > saldo && valor <= (saldo + limite)) {
            limite = (saldo + limite) - valor;
            saldo = 0;
        } else{
            return ;
        }
    }


    public double getSaldo() {
        return saldo;
    }
}
