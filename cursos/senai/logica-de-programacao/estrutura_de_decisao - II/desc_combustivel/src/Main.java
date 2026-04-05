import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite A - Alcool");
        System.out.println("Digite G - Gasolina");

        char opcao = scanner.next().toUpperCase().charAt(0);

        System.out.println("Qual a quantidade de litros?");
        double litros = scanner.nextDouble();

        double preco = 0;
        double desconto = 0;
        double total;


        switch(opcao){
            case 'A':
                preco = 2.89;

                if(litros <= 20){
                    desconto = 0.03;
                }else{
                    desconto = 0.05;
                }
                break;
            case 'G': //gasolina
                preco = 4.95;

                if(litros <= 20){
                    desconto = 0.04;
                } else{
                    desconto = 0.06;
                }
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        total = preco * litros * (1 - desconto);
        System.out.printf("Valor total a pagar: R$ %.2f\n" , total);
    }
}