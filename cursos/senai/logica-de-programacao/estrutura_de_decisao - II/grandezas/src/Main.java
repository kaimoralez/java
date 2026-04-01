import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n******************************");
        System.out.println("Calculadora de grandezas elétricas");
        System.out.println("******************************");
        System.out.println("1. Tensão (em Volt)");
        System.out.println("2. Resistência (em Ohm)");
        System.out.println("3. Tensão (em Ampére)");
        System.out.println("4. Sair do programa");
        System.out.println("******************************\n");
        System.out.println("Qual grandeza deseja calcular?");

        int opcao = scanner.nextInt();
        double resistencia;
        double tensao;
        double corrente;

        switch (opcao) {
            case 1:
                System.out.println("Calculando tensão");
                System.out.print("Digite o valor da resistencia: ");
                resistencia = scanner.nextDouble();
                System.out.print("Digite o valor da corrente: ");
                corrente = scanner.nextDouble();
                tensao = resistencia * corrente;
                System.out.print("Resultado: " + tensao + " V");
                break;
            case 2:
                System.out.println("Calculando resistência");
                System.out.print("Digite o valor da tensão: ");
                tensao = scanner.nextDouble();
                System.out.print("Digite o valor da corrente: ");
                corrente = scanner.nextDouble();
                resistencia = tensao / corrente;
                System.out.print("Resultado: " + resistencia + " Ω");
                break;
            case 3:
                System.out.println("Calculando corrente");
                System.out.print("Digite  valor da tensão: ");
                tensao = scanner.nextByte();
                System.out.print("Digite o valor da resistência: ");
                resistencia = scanner.nextDouble();
                corrente = tensao / resistencia;
                System.out.print("Resultado: " + corrente + " A");
                break;
            case 4:
                System.out.print("Você saiu da calculadora");
                break;
            default:
                System.out.println("Opção inválida;");
        }
    }
}

