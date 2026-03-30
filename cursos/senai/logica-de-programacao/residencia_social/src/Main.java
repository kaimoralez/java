import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu consumo de água: ");
        double consumo = scanner.nextDouble();
        double valor;


        if (consumo <= 0) {
            System.out.println("Digite um valor válido!");
            return;
        } else if (consumo <= 10) {
            valor =  consumo;
        } else if (consumo <= 20) {
            valor = consumo * 1.31;
        } else if (consumo <= 30) {
            valor = consumo * 4.64;
        } else if (consumo <= 50) {
            valor = consumo * 6.62;
        } else {
            valor = consumo * 7.31;
        }

        System.out.printf("Total a pagar: R$ %.2f\n", valor);

    }
}
