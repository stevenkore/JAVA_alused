import java.util.Scanner;

public class Harjutus36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type numbers: ");
        int inputer = 0;
        int sum = 0;
        int counter = 0;
        double sumAverage = 0;
        int even = 0;
        int odd = 0;

        while (true) {
        inputer = Integer.parseInt(reader.nextLine());
        if (inputer==-1) {
            break;
        } else {
            if(inputer%2==0) {
                even++;
            } else {
                odd++;
            }
            sum += inputer;
            counter++;
            sumAverage = sum;

        }
        }
        double average = (sumAverage/counter)*1.0;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
