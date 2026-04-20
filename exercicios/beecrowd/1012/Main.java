import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double pi = 3.14159;

        System.out.printf("TRIANGULO: %.3f\n", ((A * C)/ 2));
        System.out.printf("CIRCULO\n: %.3f\n", (pi * C * C));
        System.out.printf("TRAPEZIO: %.3f\n", ((A + B) * C) / 2);
        System.out.printf("QUADRADO: %.3f\n", B * B);
        System.out.printf("RETANGULO: %.3f\n", A * B);

        scanner.close();


    }
}