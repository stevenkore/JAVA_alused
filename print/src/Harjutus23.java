import java.util.Scanner;

public class Harjutus23 {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        while (true) {
            System.out.print("Input today's temperature: ");
            double graphNum = Double.parseDouble(reader.nextLine());

            if (!(graphNum < -30) && !(graphNum > 40)) {
                Graph.addNumber(graphNum);
            }
        }

        /* Graph is used as follows:
        Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests. */
    }
}
