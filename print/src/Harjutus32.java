import java.util.Scanner;

public class Harjutus32 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;

        int i = 1;

        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());

        while (i <= number) {
            sum +=i;
            i++;  // means the same as i = i + 1;
        }
        System.out.print("Sum is " + sum);
    }

}
