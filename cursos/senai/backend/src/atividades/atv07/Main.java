package atv07;

import java.util.Scanner;

public class Main {

    static void main() {
        atv07.Tamagotchi t;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do seu pet: ");

        String nome = scanner.nextLine();

        t = new atv07.Tamagotchi(nome);
        System.out.println(t.getNome());
        t.setFome(20);
        t.setEnergia(80);
        System.out.println(t.getHumor());


    }


}
