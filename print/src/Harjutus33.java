import java.util.Scanner;

public class Harjutus33 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int number2 = Integer.parseInt(reader.nextLine());

        int i = number1;
        int sum = 0;

        while (i <= number2) {
            sum+=i;
            i++;
        }
        System.out.println("The sum " + sum);
    }
}
