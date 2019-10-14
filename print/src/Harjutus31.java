import java.util.Scanner;

public class Harjutus31 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int number2 = Integer.parseInt(reader.nextLine());
        int nowNumber = number1;
        while (nowNumber <= number2) {
            System.out.println(nowNumber);
            nowNumber++;
        }
    }
}
