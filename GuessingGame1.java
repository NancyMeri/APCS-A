//Nancy
/* Create a program that will use a while loop to play a guessing game. 
 * Your game should have (1) a variable that holds the winning number 
 * between the values of 1 and 100 inclusive (you should use Math.random() 
 * to generate this number), and (2) a variable that will hold the user’s 
 * guess. Incorporate if statements to guide the user towards the right 
 * answer (e.g. let the know if their guess is too high or too low).
 */
import java.util.*;
public class GuessingGame1
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        int ans = (int) (Math.random() * 100 + 1);
        System.out.println("I have chosen a number between 1 and 100." +
        " Try to guess it!");
        int guess = scan.nextInt();
        while (guess != ans){
            if (guess > ans){
                System.out.print("Too high. ");
            }
            else{
                System.out.println("Too low. ");
            }
            System.out.println("Guess again.");
            guess = scan.nextInt();
        }
        System.out.println("Yes! " + ans + " is the number!");
    }
}
