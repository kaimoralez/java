package atividades.atv09;

public class Vendedor extends Funcionario {
    private double totalMes;

    public Vendedor(String nome, String cpf, double salario, double totalMes){
        super(nome,cpf,salario);

        if(totalMes < 0 ){
            throw new IllegalArgumentException("O valor é invalido ");
        }
        this.totalMes = totalMes;

    }

    public double getTotalMes() {
        return totalMes;
    }

    @Override
    public double calcularBonificacao() {
        return totalMes * 0.05;
    }

    @Override
    public String cargo() {
        return "Vendedor";
    }
}
