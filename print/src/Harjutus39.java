public class Harjutus39 {

    public static void printStars(int amount) {
        // you can print one star with the command
        int i = 1;
        while (i<=amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        int sides = 1;
        while (sides<=sideSize) {
            printStars(sideSize);
            sides++;
        }
    }

    public static void printRectangle(int width, int height) {

        int count = 1;
        while (count<=height) {
            printStars(width);
            count++;
        }
    }

    public static void printTriangle(int size) {
        int counterT = 1;
        while (counterT<=size) {
            printStars(counterT);
            counterT++;
        }
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);

    }


}
