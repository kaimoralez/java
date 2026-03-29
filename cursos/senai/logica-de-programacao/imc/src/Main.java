import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 16){
            System.out.println("Magreza grave");
        }else if(imc < 17){
            System.out.println("Magreza moderada");
        }else if(imc < 18.5){
            System.out.println("Magreza leve");
        }else if(imc < 25){
            System.out.println("Saudável");
        }else if(imc < 30){
            System.out.println("Sobrepeso");
        }else if(imc < 35){
            System.out.println("Obesidade Grau I");
        }else if(imc < 40){
            System.out.println("Obesidade Grau II (severa)");
        }else{
            System.out.println("Obesidade Grau III (mórbida)");
        }
    }
}