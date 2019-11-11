import java.util.Scanner;

public class Harjutus54 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of end part: ");
        int endLength = Integer.parseInt(reader.nextLine());

        String endWord = endPart(word, endLength);
        System.out.println("Result: " + endWord);
    }


    public static String endPart(String word, int endLength) {
        int totalLength = word.length();
        int newLength = totalLength-endLength;
        String endWord = word.substring(newLength);
        return endWord;
    }
}