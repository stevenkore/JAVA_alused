import java.util.Scanner;

public class Harjutus21 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.print("Type a year: ");
        int thisYear = Integer.parseInt(reader.nextLine());

        boolean true4 = (thisYear%4==0);
        boolean true400 = (thisYear%400==0);
        boolean true100 = (thisYear%100==0);


        if ((true400==true)&&(true100==true) && (true4==true)) {
            System.out.print("The year is a leap year.");
        } else if ((true400==false) && (true100==true)) {
            System.out.print("This year is not a leap year.");
        } else if (true4==true) {
            System.out.print("This year is a leap year.");
        } else {
            System.out.print("This year is not a leap year.");
        }
    }
}
