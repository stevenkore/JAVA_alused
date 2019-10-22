import java.util.Scanner;

public class Harjutus48 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String firstLetter  = "";

        System.out.print("Type your name here: ");

        String name = reader.nextLine();
        firstLetter = name.substring(0, 1);
        System.out.println("Number of characters " + firstLetter);
    }
}
