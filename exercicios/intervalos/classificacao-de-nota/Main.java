import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = scanner.nextDouble();

        if( nota < 0 || nota > 100){
            System.out.println("Nota invalida");
        }else if ( nota >= 90){
            System.out.println("A");
        }else if(nota >= 80){
            System.out.println("B");
        } else if (nota >= 70){
            System.out.println("C");
        }else if (nota >= 60){
            System.out.println("D");
        }else if (nota >= 0){
            System.out.println("F");
        }else{
            System.out.println("Nota inválida");
        }

        scanner.close();
        }
    }
