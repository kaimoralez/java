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

    public boolean sacar(double valor) {
        double total = saldo + limite;
        if(valor <= 0){
            return false;
        }

        if (valor <= saldo){
            saldo = saldo - valor;
            return true;
        } else if (valor <= total) {
            limite = total - valor;
            saldo = 0;
            return true;
        } else{
            return false;
        }
    }


    public double getSaldo() {
        return saldo;
    }
}
