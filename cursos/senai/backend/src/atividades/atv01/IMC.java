package atv27_07;

import java.util.Scanner;

public class IMC {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso:");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura:");
        double altura = scanner.nextDouble();

        double resultado = peso / Math.pow(altura,2);

        if(resultado < 18.5){
            System.out.println("Magreza (Baixo peso)");
        }else if(resultado < 24.9){
            System.out.println("Peso normal (Saudável)");
        } else if (resultado < 29.9) {
            System.out.println("Sobrepeso (Excesso de peso)");
        } else if(resultado < 34.9){
            System.out.println("Obesidade Grau I");
        } else if (resultado < 39.9) {
            System.out.println("Obesidade Grau II");
        } else{
            System.out.println(" Obesidade Grau III (Grave)");
        }
    }
}
