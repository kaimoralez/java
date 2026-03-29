import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu consumo:");
        double consumo = scanner.nextDouble();
        double valor;

        if(consumo < 0 ){
            System.out.println("Insira um valor válido:");
            return;
        } else if (consumo <= 10){
            valor = 44.95;
        } else if (consumo <= 20 ){
            valor = consumo * 8.75;
        }else if (consumo <= 50){
            valor = consumo * 16.76;
        } else{
            valor = consumo * 17.46;
        }

        System.out.printf("Valor total a pagar: R$ %.2f\n ", valor);
    }
}