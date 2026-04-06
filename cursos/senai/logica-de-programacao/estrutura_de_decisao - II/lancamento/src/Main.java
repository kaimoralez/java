import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Contagem regressiva!");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(2000);
        }
        System.out.println("Ignição!");
    }
}