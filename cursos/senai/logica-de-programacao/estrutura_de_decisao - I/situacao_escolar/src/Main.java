import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 3:");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a nota 4:");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2+ nota3 + nota4)/ 4;
        char conceito;
        String situacao;

        if (media <= 3.9){
            conceito = 'E';
        } else if (media <=5.9) {
            conceito = 'D';
        } else if (media <= 7.4) {
            conceito = 'C';
        } else if (media <= 8.9) {
            conceito = 'B';
        } else{
            conceito = 'A';
        }

        if(conceito == 'A' || conceito == 'B' || conceito == 'C'){
            situacao = "APROVADO";
        }else{
            situacao = "REPROVADO";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Media: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Você está: " + situacao);

    }
}