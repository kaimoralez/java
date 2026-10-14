
package atv16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Pessoa> banco = new ArrayList<>();
        banco.add(new Pessoa(1, "Kaique", 27));
        banco.add(new Pessoa(2, "Ana", 25));
        banco.add(new Pessoa(3, "Carlos", 30));
        banco.add(new Pessoa(4, "Beatriz", 22));
        banco.add(new Pessoa(5, "Daniel", 28));


        List<Pessoa> cache = new ArrayList<>();


        System.out.print("Digite o ID da pessoa: ");
        int idBusca = scanner.nextInt();


        Pessoa pessoaEncontrada = null;
        for (Pessoa p : cache) {
            if (p.id == idBusca) {
                pessoaEncontrada = p;
                break;
            }
        }

        if (pessoaEncontrada != null) {
            System.out.println("Pessoa encontrada no cache: " + pessoaEncontrada);
        } else {

            for (Pessoa p : banco) {
                if (p.id == idBusca) {
                    pessoaEncontrada = p;
                    break;
                }
            }

            if (pessoaEncontrada != null) {

                if (cache.size() >= 10) {
                    cache.remove(0);
                }


                cache.add(pessoaEncontrada);
                System.out.println("Pessoa buscada no banco e adicionada ao cache: " + pessoaEncontrada);
            } else {
                System.out.println("Pessoa com ID " + idBusca + " não foi encontrada no banco.");
            }
        }

        scanner.close();
    }
}
