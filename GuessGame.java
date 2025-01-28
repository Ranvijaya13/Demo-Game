
import java.util.*;

public class GuessGame {

    public static void guessingNumberGame() {
        Scanner ran = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int k = 5;
        int i, guess;
        System.out.println("A number is chosen " + " between 1 to 100." + "Guess the number" + "within 5 trail.");
        for (i = 0; i < k; i++) {
            System.out.println("Guess the number:");
            guess = ran.nextInt();

            if (number == guess) {
                System.out.println("Congratulations! " + "You guess the number.");
                break;
            } else if (number > guess && i != k - 1) {
                System.out.println("The number is" + " greater then " + guess);
            } else if (number < guess && i != k - 1) {
                System.out.println("The number is" + " less than" + guess);
            }
        }
        if (i == k) {
            System.out.println("You have exhausted" + " k trails");
            System.out.println("The number is " + number);
        }
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}
