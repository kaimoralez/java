import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String voto;
        int votosJoao = 0;
        int votosMaria = 0;
        int votosNulos= 0;

        for (int i = 1; i <=10; i++){
            System.out.print("Digite seu voto: ");

            voto = scanner.nextLine().toLowerCase(Locale.ROOT).trim();

            if(voto.equals("joao")){
                votosJoao += 1;
            }
            else if(voto.equals("maria")){
                votosMaria += 1;
            }
            else{
                votosNulos +=1;
            }

        }

        if(votosMaria > votosJoao && votosMaria> votosNulos){
            System.out.println("Maria ganhou a votacao");
        }
        else if(votosJoao > votosMaria && votosJoao > votosNulos){
            System.out.println("João ganhou ganhou a votacao");
        }
        else if(votosNulos > votosJoao && votosNulos > votosMaria){
            System.out.println("A maioria foi voto nulo");
        }else if (votosMaria == votosJoao){
            System.out.println("Empate! Maria e João possuem os mesmos votos");
        }
    }
}
