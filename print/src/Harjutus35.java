import java.util.Scanner;

public class Harjutus35 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 0;
        int sum = 0;

        while (i <= number) {

                int math = (int)Math.pow(2, i);
                sum += math;
                i++;
        }

        System.out.println("The result is "+sum);
    }

}

