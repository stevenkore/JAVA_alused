import java.util.Scanner;

public class Harjutus17 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        if (numberOne > numberTwo) {
            System.out.println("Greater number: " +numberOne);
        } else if (numberTwo > numberOne) {
            System.out.println("Greater number: " +numberTwo);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}

