import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String validacao = scanner.nextLine();

        if (validacao.isBlank()) {
            System.out.print("Dado inválido");
        } else {
            try {
                Integer validacaoInt = Integer.parseInt(validacao);
                System.out.print("Dado validado: " + validacaoInt);
            }catch(NumberFormatException e){
                System.out.print("Dado inválido");
            }

        }
    }
}