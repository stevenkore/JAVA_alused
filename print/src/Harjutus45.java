public class Harjutus45 {
    public static int greatest(int number1, int number2, int number3) {
        int biggest = 0;
        if (number1>number2&&number1>number3) {
            biggest = number1;
        } else if (number2>number1&&number2>number3) {
            biggest = number2;
        } else {
            biggest = number3;
        }
        return biggest;
    }

    public static void main(String[] args) {
        int answer =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }
}
