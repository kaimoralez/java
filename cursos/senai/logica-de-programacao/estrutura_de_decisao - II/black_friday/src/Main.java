import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de vendas");
        System.out.println("Valor total da compra:");

        double valor = scanner.nextDouble();

        System.out.println("Tipo de pagamento");
        System.out.println("Digite '1' - À vista");
        System.out.println("Digite '2' - Cartão de débito");
        System.out.println("Digite '3' - Cartão de crédito");
        System.out.println("Digite '4' - Pix");

        int pagamento = scanner.nextInt();
        double total;
        boolean verifica = true;

        switch (pagamento) {
            case 1:
                total = valor - (valor * 0.10);
                break;
            case 2:
                total = valor - (valor * 0.05);
                break;
            case 3:
                total = valor - (valor * 0.03);
                break;
            case 4:
                total = valor - (valor * 0.075);
                break;
            default:
                System.out.println("Opção inválida");
                total = 0;
                verifica = false;
        }

        if (verifica) {
            System.out.printf("Valor total com desconto: R$ %.2f\n", total);
        } else {
            System.out.println("Pagamento cancelado.");
        }
    }
}                                                               
                                       