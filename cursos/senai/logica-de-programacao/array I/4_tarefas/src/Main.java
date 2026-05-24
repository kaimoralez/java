import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> fahrenheit = new ArrayList<Double>();
        ArrayList<Double> celsius = new ArrayList<Double>();

        double temperaturaFahrenheit = 0;
        double mediaCelsius = 0;
        double mediaFahrenheit = 0;

        String tCelsius = "";

        while (!tCelsius.equals("sair")) {
            System.out.print("Digite a temperatura em Celsius: ");
            tCelsius = scanner.nextLine().toLowerCase(Locale.ROOT);

            if (!tCelsius.equals("sair")) {
                celsius.add(Double.parseDouble(tCelsius));
            }
        }

        System.out.println("Lista de Graus Celsius");
        System.out.println(celsius);

        for (double i : celsius) {
            temperaturaFahrenheit = (i * 1.8) + 32;
            fahrenheit.add(temperaturaFahrenheit);
        }

        System.out.println("Lista de Graus Fahrenheit");
        System.out.println(fahrenheit);

        for(double i: celsius){
            mediaCelsius += i;
        }

        for(double i : fahrenheit ){
            mediaFahrenheit += i;
        }

        if(!celsius.isEmpty()){
            System.out.println("Media em graus Celsius: " + mediaCelsius / celsius.size());
            System.out.println("Media em graus Fahrenheit: " + mediaFahrenheit / fahrenheit.size());
        }else {
            System.out.println("Não é possível fazer a média");
        }
    }
}

