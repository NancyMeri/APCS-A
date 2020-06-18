//Hi it's Nancy

/* Create a program that will prompt the user to type in a positive integer 
 * (you should include code to ensure that the input is positive and prompt 
 * the user for a new number if it is not) and computes
 * the sum of the digits of the that integer.
 */
import java.util.*;
public class SumOfDigits
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("please type in a positive integer");
        int num = scan.nextInt();
        while (num < 0){
            System.out.println("That's not positive. Try again.");
            num = scan.nextInt();
        }
        System.out.println("Thanks!");
        int ans = 0;
        while (num > 1){
            ans += (num % 10);
            num /= 10;
        }
        System.out.println("Digit sum: " + ans);
    }
}
