package atv04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<atv04.Carro> carros = new ArrayList<>();

        String marca;
        String modelo;
        int numPortas = 0;

        for(int i = 0; i < 2; i++){
            System.out.print("Digite a marca do carro:");
            marca = scanner.nextLine();
            System.out.print("Digite o modelo do carro:");
            modelo = scanner.nextLine();
            System.out.print("Digite o numero de portas do carro:");
            numPortas = scanner.nextInt();
            scanner.nextLine();
            carros.add(new atv04.Carro(marca,modelo,numPortas));
        }

        System.out.println(carros);



    }
}
