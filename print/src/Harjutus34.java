import java.util.Scanner;

public class Harjutus34 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int i = 1;
        int factorial = 1;

        while (i <= number) {
            if (number == 0) {
            factorial = 1;
            break;
            }
            factorial*= i;
            i++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
