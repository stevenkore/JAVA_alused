import java.util.Scanner;

public class Harjutus52 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int length = howManyChars(name);
        printReverseCharacters(name, length);
    }

    public static void printReverseCharacters(String name, int charsNum) {
        System.out.print("In reverse order: ");
        int counter = 0;
        int nameLength = name.length()-1;
        while (counter <= charsNum) {
            int charChoice = nameLength-counter;
            char printChar = pullChar(name, charChoice);
            System.out.print(printChar);
            counter++;
        }
    }

    public static int howManyChars(String name) {
        int length = name.length() - 1;
        return length;
    }

    public static char pullChar(String name, int charNum) {
        char returnChar = name.charAt(charNum);
        return returnChar;
    }
}

