package atv06;

public class ContaBancaria {
    private String titular;
    private double saldo = 0;
    private double limite;
    private double limiteAtual;

    public ContaBancaria(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
        this.limiteAtual = limite;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            return;
        } else if (limiteAtual < limite) {
            limiteAtual = limiteAtual + valor;
            if (limiteAtual > limite) {
                saldo = saldo + (limiteAtual - limite);
                limiteAtual = limite;
            }
        } else {
            saldo = saldo + valor;
        }
    }

    public boolean sacar(double valor) {

        double total = saldo + limiteAtual;
        if (valor <= 0) {
            return false;
        }

        if (valor <= saldo) {
            saldo = saldo - valor;
            return true;
        } else if (valor <= total) {
            limiteAtual = total - valor;
            saldo = 0;
            return true;
        } else {
            return false;
        }
    }


    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "=========  ContaBancaria  =========" +
                "\n Titular = " + titular +
                "\n Saldo = " + saldo +
                "\n Limite Contratado = " + limite +
                "\n Limite Atual = " + limiteAtual;
    }
}
