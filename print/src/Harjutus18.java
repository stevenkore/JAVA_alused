import java.util.Scanner;

public class Harjutus18 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the Points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());

        System.out.println("");
        System.out.print("Grade: ");

        if (points >= 0 && points<30) {
            System.out.print("failed");
        } else if (points >= 30 && points<35) {
            System.out.print("1");
        } else if (points >= 35 && points<40) {
            System.out.print("2");
        } else if (points>=40&&points<45) {
            System.out.print("3");
        } else if (points>=45&&points<50) {
            System.out.print("4");
        } else if (points>=50&&points<=60) {
            System.out.print("5");
        }

    }
}

