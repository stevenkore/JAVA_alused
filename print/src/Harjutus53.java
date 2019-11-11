import java.util.Scanner;

public class Harjutus53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of first part: ");
        int length = Integer.parseInt(reader.nextLine());

        String partWord = firstPart(word, length);
        System.out.println("Result: " + partWord);
    }


    public static String firstPart(String word, int length) {
        String partWord = word.substring(0, length);
        return partWord;
    }
}
