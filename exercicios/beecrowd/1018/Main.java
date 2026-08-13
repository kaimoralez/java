import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int valor = scanner.nextInt();

        ArrayList<Integer> notas = new ArrayList<>();
        int qtdNotas;

        notas.add(100); 
        notas.add(50);
        notas.add(20);
        notas.add(10);
        notas.add(5);
        notas.add(2);
        notas.add(1);
        
        System.out.println(valor); 
        for(int nota : notas){
            qtdNotas = valor / nota;
            valor =  valor % nota;
            
            System.out.println(qtdNotas + " nota(s) de R$ " + nota + ",00");
        }

    }
}
