import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Turno de estudo");

        System.out.println("Digite 'M' - Matutino");
        System.out.println("Digite 'V' - Vespertino");
        System.out.println("Digite 'N' - Noturno");

        char turno = scanner.next().toUpperCase().charAt(0);

        switch (turno) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde");
                break;
            case 'N':
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}