public class Harjutus44 {
    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method

        // method needs a return in the end

        int least = 0;
        if (number1 > number2) {
            least = number2;
        }
        else {
            least = number1;
        }
        return least;
    }

    public static void main(String[] args) {
        int answer =  least(2, 7);
        System.out.println("Least: " + answer);
    }
}
