import java.util.Scanner;

public class Harjutus22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String password = "carrot"; // Use carrot as password when running tests.
        String Right = "The secret is secret of course :)";

        while (true) {
            System.out.print("Type a password: ");
            String myPassword = reader.nextLine();


            if (myPassword.equals(password)) {
                System.out.println("Right!");
                break;
            }
            System.out.println("Wrong!");
        }
        System.out.print("The Secret is: " + Right);


    }
}
