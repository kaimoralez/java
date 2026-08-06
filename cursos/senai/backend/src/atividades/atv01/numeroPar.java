package atv27_07;

import java.util.Scanner;

public class numeroPar {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int numeroPar = numero % 2 ;

        if(numeroPar == 0){
            System.out.println(numero + " é par");
        }else{
            System.out.println(numero + " é impar");
        }

    }
}
