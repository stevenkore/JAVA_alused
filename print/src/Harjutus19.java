import java.util.Scanner;

public class Harjutus19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int ageNumber = Integer.parseInt(reader.nextLine());

        if (ageNumber > -1 && ageNumber < 119) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
