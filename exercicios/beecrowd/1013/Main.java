import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorFinal = (maiorAB + c + Math.abs(maiorAB - c))/2;

        System.out.println(maiorFinal + " eh o maior");

        scanner.close();
    }
}
