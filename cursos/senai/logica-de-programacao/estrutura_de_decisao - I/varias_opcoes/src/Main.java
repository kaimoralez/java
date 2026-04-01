import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Opção 1");
        System.out.println("2 - Opção 2");
        System.out.println("3 - Opção 3");
        System.out.println("4 - Opção 4");
        System.out.println("Digite uma opção: ");

        int opcao = scanner.nextInt();

        if(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
            System.out.println("Opção inválida");
            return;
        }

        if (opcao == 1){
            System.out.println("Você selecionou a opção 1");
        }else if (opcao == 2){
            System.out.println("Você selecionou a opção 2");
        }else if(opcao ==3){
            System.out.println("Você selecionou a opção 3");
        } else {
            System.out.println("Você selecionou sair");
        }

    }
}