import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.println("Digite o lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.println("Digite o lado C: ");
        double ladoC = scanner.nextDouble();


        if (ladoA + ladoB <= ladoC ||
                ladoA + ladoC <= ladoB ||
                ladoB + ladoC <= ladoA) {

            System.out.println("Os valores não formam um triângulo");
            return;
        }

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Triângulo Equilátero: três lados iguais");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            System.out.println("Triângulo Isósceles: quaisquer dois lados iguais");
        } else {
            System.out.println("Triângulo Escaleno: três lados diferentes");
        }
    }
}