package atv27_07;

public class conversao {
    static void main() {
        double real = Double.parseDouble(IO.readln(""));

        double dolar = real * 0.19;
        double euro = real * 0.17;

        System.out.printf("Valor do real convertido em dolar: %.2f\n", dolar);
        System.out.printf("Valor do real convertido em euro: %.2f", euro);
    }

}
