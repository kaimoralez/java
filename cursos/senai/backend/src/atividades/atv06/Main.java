package atv07;

public class Main {
    static void main() {
        atv06.ContaBancaria c = new atv06.ContaBancaria("Maria", 500);
        c.sacar(200);
        System.out.println(c);

        c.depositar(200);

        System.out.println(c);

    }
}

