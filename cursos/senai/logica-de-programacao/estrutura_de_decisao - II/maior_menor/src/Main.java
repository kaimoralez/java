
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a velocidade: ");
        double velocidade = scanner.nextDouble();

        double multa;
        double excedeu;

        if (velocidade < 0) {
            System.out.println("Digite um valor válido ");
            return;
        }

        if (velocidade > 80) {
            excedeu = velocidade - 80;
            multa = excedeu * 50;
        } else {
            multa = 0;
            excedeu = 0;
        }

        System.out.println("Excedeu: " + excedeu + " km/h");
        System.out.println("Valor da multa: R$" + multa);
    }
}