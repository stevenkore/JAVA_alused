import java.util.Scanner;

public class Harjutus8 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");

        int x = reader.nextInt();

        System.out.print("Type another number: ");

        int y = reader.nextInt();

        int sum = x + y;

        System.out.println("Sum of the numbers: " + sum);
    }
}

