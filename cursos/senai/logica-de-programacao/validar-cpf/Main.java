import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu CPF:");
        String cpf = scanner.nextLine();

        //Filtros para tirar espaços e substituindo caracteres
        cpf = cpf.trim();
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        //Verificação se o CPF possui 11 digitos
        if (cpf.length() != 11) {
            System.out.println("CPF Inválido: tamanho incorreto");
            return;
        }

        //Verificação se o CPF possui apenas números
        for (int i = 0; i < cpf.length(); i++) {
            if (cpf.charAt(i) < '0' || cpf.charAt(i) > '9') {
                System.out.println("CPF inválido");
                return;
            }
        }

        //Verificação para confirmar se os números são todos repetidos ou não
        boolean iguais = true;

        for (int i = 0; i < cpf.length(); i++) {

            if (cpf.charAt(0) != cpf.charAt(i)) {
                iguais = false;
            }
        }

        if(iguais){
            System.out.println("CPF inválido");
            return;
        }

        // Verificaçao do primeiro digito
        int soma = 0;
        for(int i = 0; i < 9; i++){
            int n1 = Character.getNumericValue(cpf.charAt(i));
            int peso = 10 - i;
            soma += n1 * peso;
        }
        int resto = soma % 11;
        int digito1;

        if(resto < 2){
            digito1 = 0;
        } else{
            digito1 = 11 - resto;
        }

        if(digito1 != Character.getNumericValue(cpf.charAt(9))){
            System.out.println("CPF inválido");
            return;
        }

        // Verificaçao do segundo digito
        soma = 0;

        for(int i = 0; i < 10; i++) {
            int n2 = Character.getNumericValue(cpf.charAt(i));
            int peso = 11 - i;
            soma += n2 * peso;
        }
        resto = soma %11;
        int digito2;

        if(resto < 2){
            digito2 = 0;
        }else{
            digito2 = 11 - resto;
        }

        if(digito2 != Character.getNumericValue(cpf.charAt(10))){
            System.out.println("CPF inválido");
            return;
        }

        System.out.println("CPF válido!");

    }
}

