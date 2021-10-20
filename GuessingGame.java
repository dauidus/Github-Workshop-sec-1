/* Name: David Lam
 * Date: 1/29/2020
 * Description: User enters guesses for a number range 1-100. program states number of turns needed to correctly guess
 */
import java.util.Random;
public class guessingGame {
    public static void main(String[] args) {
        // This sets up the random number range and user input

        System.out.println("I'm thinking of a number. Guess a value (1-100): ");
        Random rand = new Random();
        int max = 100;
        int rand_int = rand.nextInt(max) + 1;
        //System.out.println(rand_int);
        int user_num = CheckInput.getIntRange(1,100);
        int counter = 0;

        // While loop for incrementing tries if guessed wrong number

        while (user_num != rand_int) {
            if (user_num < rand_int) {
                System.out.println("Too Low. Guess again: ");
                counter = counter + 1;
                user_num = CheckInput.getIntRange(1,100);
            }
            else {
                System.out.println("Too High. Guess again: ");
                counter = counter + 1;
                user_num = CheckInput.getIntRange(1,100);
            }
        }
        // Last code block displaying number of tries when correct number is inputted

        counter += 1;
        System.out.println("Correct! You got it in " + counter + " tries.");
    }
//        for (int i = 0; i < 10; i++) {
//            int input = CheckInput.getInt();
//        }
    }



