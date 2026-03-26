import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        int horas = scanner.nextInt();
        double salario = scanner.nextDouble();

        double salarioTotal = horas * salario;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f\n",salarioTotal);

        scanner.close();
    }
}