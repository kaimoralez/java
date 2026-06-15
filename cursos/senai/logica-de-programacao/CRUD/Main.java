import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        int[] idades = new int[10];
        String[] cursos = new String[10];

        int totalAlunos = 0;

        int opcao;

        do {
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno pelo nome");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção:");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (totalAlunos < 10) {
                        System.out.println("Digite o nome do aluno:");
                        String nome = scanner.nextLine();
                        if (!nome.isEmpty()) {
                            nomes[totalAlunos] = nome;
                        } else {
                            System.out.println("ERROR: o nome do aluno não pode ficar vazio.");
                            break;
                        }

                        System.out.println("Digite a idade do aluno:");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        idades[totalAlunos] = idade;

                        System.out.println("Digite o curso do aluno:");
                        String curso = scanner.nextLine();
                        cursos[totalAlunos] = curso;

                        System.out.println("Aluno cadastrado.");
                        totalAlunos++;

                    } else {
                        System.out.println("O numero máximo de cadastro de aluno é 10");
                    }
                    break;

                case 2:
                    if (totalAlunos == 0) {
                        System.out.println("Nenhum aluno cadastrado no momento.");
                    } else {
                        for (int i = 0; i < totalAlunos; i++) {
                            System.out.println("---   Aluno " + (i + 1) + " ---");
                            System.out.println("Nome: " + nomes[i]);
                            System.out.println("Idade: " + idades[i]);
                            System.out.println("Curso: " + cursos[i]);
                        }
                    }

                    break;
                case 3:
                    System.out.println("Digite o nome do aluno que você deseja procurar:");
                    String procura = scanner.nextLine();
                    boolean encontradoP = false;

                    if (totalAlunos == 0) {
                        System.out.println("Nenhum aluno cadastrado no momento.");
                    } else {
                        for (int i = 0; i < totalAlunos; i++) {
                            if (nomes[i].equalsIgnoreCase(procura)) {
                                System.out.println("---   Aluno encontrado ---");
                                System.out.println("Nome: " + nomes[i]);
                                System.out.println("Idade: " + idades[i]);
                                System.out.println("Curso: " + cursos[i]);
                                encontradoP = true;
                                break;
                            }
                        }
                        if (encontradoP == false) {
                            System.out.println("Aluno não encontrado");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do aluno que você deseja excluir:");
                    String exclui = scanner.nextLine();
                    boolean encontradoE = false;

                    if (totalAlunos == 0) {
                        System.out.println("Nenhum aluno cadastrado no momento.");
                    } else {
                        for (int i = 0; i < totalAlunos; i++) {
                            if (nomes[i].equalsIgnoreCase(exclui)) {
                                for( int j = i; j < totalAlunos - 1; j++){
                                    nomes[j] = nomes [j + 1];
                                    idades[j] = idades [j + 1];
                                    cursos[j] = cursos [j + 1];
                                }

                                encontradoE = true;
                                System.out.println("Aluno excluido!");
                                totalAlunos--;
                                break;
                            }
                        }
                        if (encontradoE == false) {
                            System.out.println("Aluno não encontrado");
                        }
                    }
                break;

            }
        } while (opcao != 5);

        System.out.println("Você saiu do programa!");
    }
}
