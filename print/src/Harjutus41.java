import java.util.Random;
import java.util.Scanner;

public class Harjutus41 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int i = 0;

        while (true) {
            System.out.print("Guess a number: ");
            int rand = Integer.parseInt(reader.nextLine());
            i++;
            if (rand == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (rand > numberDrawn) {
                System.out.println("The number is lesser, guesses made: "+i);
            } else if (rand < numberDrawn) {
                System.out.println("The number is greater, guesses made: "+i);
            }
        }

    }
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
