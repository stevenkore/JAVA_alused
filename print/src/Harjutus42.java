import hangman.Hangman;
import java.util.Scanner;

public class Harjutus42 {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            Hangman hangman = new Hangman();

            System.out.println("***********");
            System.out.println("* HANGMAN  *");
            System.out.println("***********");
            System.out.println("");
            printMenu();
            System.out.println("");

            // PROGRAM YOUR SOLUTION HERE
            while (hangman.gameOn()) {
                System.out.println("Type a command:");
                String inputer = reader.nextLine();
                if (inputer.equals("quit")) {
                    System.out.println("Thank you for playing!");
                    break;
                } else if (inputer.equals("status")) {
                    hangman.printStatus();
                } else if (inputer.length()==1) {
                    hangman.guess(inputer);
                } else if (inputer.isEmpty()) {
                    printMenu();
                }
                hangman.printMan();
                hangman.printWord();
            }
        }

        public static void printMenu() {
            System.out.println(" * menu *");
            System.out.println("quit   - quits the game");
            System.out.println("status  - prints the game status");
            System.out.println("a single letter uses the letter as a guess");
            System.out.println("an empty line prints this menu");
        }

}
