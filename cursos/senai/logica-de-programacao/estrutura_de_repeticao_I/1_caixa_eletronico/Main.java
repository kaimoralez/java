import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua senha: ");

        String senha = "4321";

        for (int i = 0; i < 3; i++) {
            String tentativas = scanner.nextLine().trim();

            if (tentativas.equals(senha)) {
                System.out.print("Senha valida!");
                break;
            } else {
                if (i == 2) {
                    System.out.print("Conta bloqueada");
                } else {
                    System.out.print("Senha invalida!Tente novamente:");
                }
            }

        }

    }
}
