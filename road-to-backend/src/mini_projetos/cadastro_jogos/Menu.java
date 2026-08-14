package mini_projetos.cadastro_jogos;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private CadastroJogo cadastroJogo = new CadastroJogo();

    public void exibirMenu() {

        int opcao = -1;
        do {
            System.out.println("======== Menu ========");
            System.out.println("1 - Adicionar novo jogo");
            System.out.println("2 - Listar jogos");
            System.out.println("3 - Buscar jogo");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quanto jogos você gostaria de adicionar?");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 1; i <= qtd; i++) {

                        System.out.print("Nome do jogo: ");
                        String nome = scanner.nextLine();

                        System.out.print("Genero: ");
                        String genero = scanner.nextLine();

                        System.out.print("Ano de lançamento: ");
                        int anoLancamento = scanner.nextInt();

                        System.out.print("Nota: ");
                        double nota = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Plataforma: ");
                        String plataforma = scanner.nextLine();

                        Jogo jogo = new Jogo(nome, genero, anoLancamento, nota, plataforma);
                        cadastroJogo.adicionar(jogo);

                        System.out.println("Jogo cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.println("Lista de todos os jogos");
                    cadastroJogo.listar();
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.println("Qual jogo você quer buscar? ");
                    String buscarJogo = scanner.nextLine();
                    Jogo resultado = cadastroJogo.buscar(buscarJogo);

                    if (resultado != null) {
                        System.out.println(resultado);
                    } else {
                        System.out.println("Jogo não encontrado");
                    }
                    break;

                case 0:
                    System.out.println("Você saiu! Até logo.");
                    break;

                default:
                    System.out.println("Insira uma opção válida");
                    break;
            }

        } while (opcao != 0);


    }


}
