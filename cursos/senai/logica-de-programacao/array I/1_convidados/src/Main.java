import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] convidados = new String [5];

        for (int i = 0; i < convidados.length; i++){
            System.out.print("Digite o nome do convidado " + (i + 1) + ":");
            convidados[i] = scanner.nextLine();
        }
        System.out.println("Lista de convidados: " );

        for (int i = 0; i < convidados.length; i++){
            System.out.println(convidados[i]);
        }
    }
}