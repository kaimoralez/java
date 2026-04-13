import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int codigo1 = scanner.nextInt();
        int peca1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        int codigo2 = scanner.nextInt();
        int peca2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        double valortotal = (peca1 * valor1) + (peca2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valortotal);

        scanner.close();
        }
    }