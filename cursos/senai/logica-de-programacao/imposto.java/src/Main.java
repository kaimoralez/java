import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        double salario = scanner.nextDouble();
        double inss;

        if(salario < 0){
            System.out.println("Salário inválido:");
            return;
        }

        if(salario <= 1412.00){
            inss = salario * 0.075;
        } else if (salario <= 2666.68) {
            inss = salario * 0.09;
        } else if (salario <= 4000.03 ) {
            inss =

                    reajsalario * 0.12;
        } else {
            inss = salario * 0.14;
        }

        double baseIRRF = salario - inss;
        double irrf;
        
        if(baseIRRF <= 2259.20){
            irrf = 0;
        } else if (baseIRRF <= 2826.65) {
            irrf = (baseIRRF * 0.075) - 169.44;
        } else if (baseIRRF <= 3751.05) {
            irrf = (baseIRRF * 0.15) - 381.44;
        }else if (baseIRRF <= 4664.68) {
            irrf = (baseIRRF * 0.225) - 662.77;
        } else{
            irrf = (baseIRRF * 0.275) - 896.00;
        }

        double salarioLiquido = salario - inss - irrf;

        System.out.printf("Salário = R$ %.2f\n" , salario);
        System.out.printf("Desconto INSS = R$ %.2f\n", inss);
        System.out.printf("Desconto IRRF = R$ %.2f\n", irrf);
        System.out.printf("Salário líquido = R$ %.2f\n", salarioLiquido);

    }
}