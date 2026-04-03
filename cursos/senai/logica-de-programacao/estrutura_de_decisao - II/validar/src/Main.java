import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite alguma informação: ");
        String validacao = scanner.nextLine();

        if(validacao.isBlank()){
            System.out.print("Dado inválido");
        } else{
            System.out.print("Dado validado");
        }

    }
}