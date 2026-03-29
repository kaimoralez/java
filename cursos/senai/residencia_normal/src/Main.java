import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double consumo = scanner.nextDouble();
        double valor;

        System.out.println();
        if(consumo < 0){
            System.out.println("Insira um valor válido");
            return;
        }
        else if(consumo <= 10){
            valor = 22.38;
        }else if(consumo <= 20){
            valor = consumo * 3.50;
        }else if (consumo <= 50){
            valor = consumo * 8.75;
        }else{
            valor = consumo * 9.64;
        }

        System.out.printf("Valor total a pagar: R$ %.2f\n", valor);

    }
}