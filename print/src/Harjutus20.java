import java.util.Scanner;

public class Harjutus20 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String userName = reader.nextLine();
        System.out.print("Type your password: ");
        String passWord = reader.nextLine();

        if ((userName.equals("alex")&& passWord.equals("mightyducks")) || (userName.equals("emily")&& passWord.equals("cat")))  {
            System.out.print("You are now logged into the system!");
        }
        else {
            System.out.print("Your username or password was invalid!");
        }

    }

}
