import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaTotal = 0;
        double maiorNumero = 0;
        double menorNumero= 0;
        double somaPares = 0;
        double somaImpares = 0;
        double quantidadePares = 0;
        double quantidadeImpares = 0;

        for(int i = 1; i <= 10; i++ ){

            double numero = scanner.nextDouble();
            somaTotal += numero;

            if(numero % 2 == 0){
                somaPares += numero;
                quantidadePares += 1;
            }else{
                somaImpares += numero;
                quantidadeImpares += 1;
            }

            

            if(numero > maiorNumero){
                maiorNumero = numero;
            }
            if(numero < menorNumero){
                menorNumero = numero;
            }

        }
        System.out.println("Soma total:" + somaTotal);
        System.out.println("Média:" + somaTotal/10);
        System.out.println("Soma soma dos pares:" + somaPares);
        System.out.println("Soma dos impares:" + somaImpares);
        System.out.println("Quantidade de numeros pares:" + quantidadePares);
        System.out.println("Quantidade de numeros impares:" + quantidadeImpares);



    }
}
