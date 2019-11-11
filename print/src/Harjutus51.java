import java.util.Scanner;

public class Harjutus51 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int length = howManyChars(name);
        printAllCharacters(name, length);
    }

    public static void printAllCharacters(String name, int charsNum) {
        int counter = 0;
        while (counter<=charsNum) {
            char printChar = pullChar(name, counter);
            System.out.println((counter+1)+". character: "+printChar);
            counter++;
        }
    }
    public static int howManyChars(String name) {
        int length = name.length()-1;
        return length;
    }
    public static char pullChar(String name, int charNum) {
        char returnChar = name.charAt(charNum);
        return returnChar;
    }


}
