import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da distancia: ");

        double distancia = scanner.nextDouble();
        double valorTotal;

        if(distancia > 200){
            valorTotal = distancia * 0.45;
        } else{
            valorTotal = distancia * 0.50;
        }

        System.out.printf("Valor total: R$ %.2f\n", valorTotal );

    }
}
