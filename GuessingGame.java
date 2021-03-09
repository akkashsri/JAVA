import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an int from 0 to 1: ");
        int  inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10)+1;

        if (inputNumber == randomNumber) {
            System.out.println("**************");
            System.out.println("*You Win*");
            System.out.println("**************");
        }
        else {
            System.out.println("You Lose.");
            System.out.println("The Random Number was ");
            System.out.println(randomNumber+".");
        }

        System.out.println("Thank You for playing");
        keyboard.close();
    }
}