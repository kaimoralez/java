import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int x = scanner.nextInt();

        int y = x * 2;

        System.out.println(y + " minutos");
        
        scanner.close();

    }
}
