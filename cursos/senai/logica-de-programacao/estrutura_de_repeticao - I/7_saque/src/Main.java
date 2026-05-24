import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double saldo = 500;

        int opcao = -1;


        while (opcao != 0){
            System.out.println("1.Saque");
            System.out.println("2.Depósito");
            System.out.println("3.Saldo");
            System.out.println("0.Sair");

            System.out.print("Escolha uma opção:");

            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("Quanto você deseja sacar?");
                double saque = scanner.nextDouble();
                if (saque > 0 && saque <= saldo){
                    saldo -= saque;
                    System.out.printf("Você sacou: R$%.2f\n", saque);
                    System.out.printf("Saldo atual: R$%.2f\n", saldo);

                }else{
                    System.out.println("Valor inválido ou saldo insuficiente.");
                }
            }
            else if(opcao == 2){
                System.out.println("Quanto você deseja depositar?");
                double deposito = scanner.nextDouble();
                if (deposito > 0) {
                    saldo += deposito;
                    System.out.printf("Você depositou: R$%.2f\n", deposito);
                    System.out.printf("Saldo atual: R$%.2f\n", saldo);
                } else{
                    System.out.println("Valor inválido para depósito");
                }
            }
            else if(opcao == 3){
                System.out.printf("Seu saldo atual é:R$%.2f\n", saldo);
            }
            else if(opcao == 0){
                System.out.println("Saindo...");
            }
            else{
                System.out.println("Opção inválida");
            }


        }

    }
}