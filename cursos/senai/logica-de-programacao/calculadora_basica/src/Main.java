import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");

        System.out.print("Digite um numero: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite outro numero: ");
        double n2 = scanner.nextDouble();

        System.out.println("Selecione uma opção para calcular");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potência");
        System.out.println("6 - Raiz quadrada");
        System.out.println("7 - Número par");
        System.out.println("8 - Número impar");
        System.out.println("9 - Sair ");


        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("Resultado: %.2f\n", (n1 + n2));
                break;
            case 2:
                System.out.printf("Resultado: %.2f\n", (n1 - n2));
                break;
            case 3:
                System.out.printf("Resultado: %.2f\n", (n1 * n2));
                break;
            case 4:
                if( n2 == 0){
                    System.out.println("Não é possível divdir por zero");
                }else{
                    System.out.printf("Resultado: %.2f\n", (n1 / n2));
                }
                break;
            case 5:
                System.out.println(Math.pow(n1, n2));
                break;
            case 6:
                System.out.printf("Resultado: %.2f\n ", Math.sqrt(n1));
                System.out.printf("Resultado: %.2f\n ", Math.sqrt(n2));
                break;
            case 7:
                System.out.println("n1 é " + (n1 % 2 == 0 ? "par" :"impar"));
                System.out.println("n2 é " + (n2 % 2 == 0 ? "par" :"impar"));
                break;
            case 8:
                System.out.println("n1 é " + (n1 % 2 != 0 ? "impar" :"par"));
                System.out.println("n2 é " + (n2 % 2 != 0 ? "impar" :"par"));
                break;
            case 9:
                System.out.println("Obrigado!");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
