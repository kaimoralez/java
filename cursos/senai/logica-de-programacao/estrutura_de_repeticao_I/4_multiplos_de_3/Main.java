import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i + " é um número multiplo de 3");
                soma += i;
            }
        }
        System.out.println("A soma total dos múltiplos de 3 de 0 até a 100 é : " + soma);
    }
}
