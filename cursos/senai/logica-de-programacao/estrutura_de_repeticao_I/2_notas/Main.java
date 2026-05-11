import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        double media;
        String resultado;

        for (int i = 1; i <= 4; i++) {
            double soma = 0;
            System.out.println("Digite a nota do aluno " + i);
            for (int n = 1; n <= 4; n++) {
                System.out.print("Digite sua nota " + n + ":");
                double leituraNota = scanner.nextDouble();
                soma += leituraNota;
            }
            media = soma / 4;
            if(media >= 7){
                System.out.println("Aprovado");
            }else if(media <= 6.9 && media > 5){
                System.out.println("Recuperacao");
            }else{
                System.out.println("Reprovado");
            }
            resultado = ("Media do aluno " + i + ": " + media);
            System.out.println(resultado);
        }
    }
}
