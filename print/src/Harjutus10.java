import java.util.Scanner;

public class Harjutus10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");

        int radius = reader.nextInt();

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference of the circle: " + circumference);
    }
}
