import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do(s) produto(s): ");

        double valorTotal = 0;
        double valorProduto = scanner.nextDouble();

        while(valorProduto != 0){
            valorTotal += valorProduto;
            System.out.printf("Valor: R$ %.2f\n", valorTotal);
            valorProduto = scanner.nextDouble();
        }

        System.out.printf("Valor total a pagar : R$ %.2f", valorTotal);

    }
}
