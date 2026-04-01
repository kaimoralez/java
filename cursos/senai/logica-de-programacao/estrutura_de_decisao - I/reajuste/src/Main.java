import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();
        double percentual;
        double aumento;
        double novoSalario;

        if (salario <= 0) {
            System.out.println("Insira um valor válido");
            return;
        }

        if (salario <= 1000) {
            percentual = 0.20;
        } else if (salario <= 1700) {
            percentual = 0.15;
        } else if (salario <= 2300) {
            percentual = 0.10;
        } else {
            percentual = 0.05;

        }

        aumento = salario * percentual;
        novoSalario = salario + aumento;

        System.out.printf("Salário digitado: R$ %.2f\n", salario);
        System.out.printf("Percentual de aumento: %.2f\n", percentual * 100);
        System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
        System.out.printf("Novo salário: R$ %.2f\n" , novoSalario);


    }
}