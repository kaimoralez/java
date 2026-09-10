package atividades.atv09;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode estar em branco");
        }
        this.nome = nome;

        if (cpf.isEmpty()) {
            throw new IllegalArgumentException("O cpf não pode ser em branco");
        }
        this.cpf = cpf;

        if (salario <= 0) {
            throw new IllegalArgumentException("O salário não não pode ser igual a 0");
        }
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularBonificacao();
    public abstract String cargo();

    public double calcularRemuneracaoTotal(){
        return salario + calcularBonificacao();
    }


    public void exibirHolerite(){
        System.out.println("===== Funcionario =====");
        System.out.println("Nome = " + nome);
        System.out.println("Cargo = " + cargo());
        System.out.printf("Salario = R$ %.2f\n" , salario);
        System.out.printf("Bonificação = R$ %.2f\n" , calcularBonificacao());
        System.out.printf("Remuneração = R$ %.2f\n" , calcularRemuneracaoTotal());
    }

}
