import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horas = scanner.nextInt();
        int vMedia = scanner.nextInt();
        int kmLitro = 12;

        double distancia = horas * vMedia;

        double resultado = distancia / kmLitro;

        System.out.printf("%.3f\n", resultado);

        scanner.close();


    }
}
