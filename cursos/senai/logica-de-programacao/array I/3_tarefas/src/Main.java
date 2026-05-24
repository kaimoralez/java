import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<String>();

        System.out.println("Digite suas tarefas: ");

        while(!tasks.contains("fim")){
            tasks.add(scanner.nextLine().toLowerCase(Locale.ROOT));
        }

        System.out.println("Todas as tarefas: ");
        System.out.println(tasks);
    }
}