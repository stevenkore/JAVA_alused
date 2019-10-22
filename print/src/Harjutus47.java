import java.util.Scanner;

public class Harjutus47 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.print("Type your name here: ");
        String name = reader.nextLine();
        int nameLength = name.length();
        System.out.println("Number of characters " + nameLength);
    }

}
