import java.util.Scanner;

public class Harjutus30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 1;
        System.out.print("Up to what numbers? ");
        int number1 = Integer.parseInt(reader.nextLine());

        while (number <= number1) {
            System.out.println(number);
            number++;
        }


    }

}
