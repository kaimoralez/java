import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var nums = new ArrayList<Integer>();

        System.out.println("Digite 5 numeros");


        for (int i = 0; i <= 5; i++) {
            nums.add(scanner.nextInt());
        }

        System.out.println(nums);
    }
}