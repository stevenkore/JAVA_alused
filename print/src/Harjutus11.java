import java.util.Scanner;

public class Harjutus11 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");

        int x = reader.nextInt();

        System.out.print("Type another number: ");

        int y = reader.nextInt();

        int biggerNum = Math.max(x, y);

        System.out.println("The bigger number of the two numbers given was: " + biggerNum);
    }

}
