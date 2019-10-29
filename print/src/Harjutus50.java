import java.util.Scanner;

public class Harjutus50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        if (name.length()<3) {
            System.out.println("");
        } else {
            char a = chooseChar(name, 1);
            char b = chooseChar(name, 2);
            char c = chooseChar(name, 3);
            printThree(a, b, c);
        }
    }

    public static char chooseChar(String name, int locale) {
        char character = name.charAt(locale-1);
        return character;
    }

    public static void printThree(char a, char b, char c) {
        System.out.println("1. character: "+a);
        System.out.println("2. character: "+b);
        System.out.println("3. character: "+c);
    }
}

