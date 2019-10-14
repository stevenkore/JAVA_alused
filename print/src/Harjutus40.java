public class Harjutus40 {
    public static void printStars(int amount) {
        // you can print one star with the command
        int i = 1;
        while (i<=amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
    public static void printRectangle(int width, int height) {
        int count = 1;
        while (count<=height) {
            printStars(width);
            count++;
        }
    }



    public static void printWhitespaces(int amount) {
        int i = 1;
        while (i<=amount) {
            System.out.print(" ");
            i++;
        }
    }
    public static void printTriangle(int size) {
        int i = 1;
        while (i<=size) {
            printWhitespaces(size-i);
            printStars(i);
            i++;
        }
    }
    public static void xmasTree(int height) {
        int i = 1;
        while (i<=height) {
            printWhitespaces(height-i);
            printStars(i+(i-1));
            i++;
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {

        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }

}

