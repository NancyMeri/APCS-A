//Nancy

/* Write a program that will get from the user a range of numbers (ask for 
 * the beginning of the range and the end of the range -- make sure that 
 * beginning <= end; re-prompt for the range if this is not the case). Print 
 * these numbers out in-order and in reverse-order. Then print out all the 
 * multiples of 7 within that range.
 */
import java.util.*;
public class PlayingWithNumbers
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        boolean inRange = false;
        int low = 0;
        int up = 0;
        while (inRange == false){
            System.out.println("Enter the beginning of the range");
            low = scan.nextInt();
            System.out.println("Enter the end of the range");
            up = scan.nextInt();
            inRange = (low <= up);
            if (true != inRange){ System.out.println("invalid range");}
        }
        for (int i = low; i <= up; i++){
            System.out.println(i);
        }
        for (int i = up; i >= low; i--){
            System.out.println(i);
        }
        for (int i = low; i <= up; i++){
            if (i % 7 == 0){System.out.println(i); }
        }
    }
}
