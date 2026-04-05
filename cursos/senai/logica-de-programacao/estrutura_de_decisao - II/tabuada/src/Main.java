import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.print("Informe o número da tabuada: ");
        int num = scanner.nextInt();
        System.out.println("******************************");


        for (int i = 1; i <= 10; i++) {

            System.out.println( num + " x " + i + " = " + (num * i) );
        }
    }
}