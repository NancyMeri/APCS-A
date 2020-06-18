//Nancy
/* Write a program that asks the user how many participants there are. 
 * Then, use a for loop to keep track of the total donations. Ask for each
 * participant’s donation rate per jump. Then ask how many jumps each 
 * person makes. Calculate the amount of money earned per person and add 
 * to the total donations. After all participant information has been 
 * entered and accounted for, print out the total amount earned by the 
 * Jump Rope for Heart Program.
 */
import java.util.*;
public class JumpRope
{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("how many participants are there?");
        int humans = scan.nextInt();
        double donations = 0;
        for (int x = 1; x <= humans; x ++){
            System.out.println("what is person " + x + "'s donation rate per jump?");
            double rate = scan.nextDouble();
            System.out.println("what is person " + x + "'s total number of jumps?");
            int jumps = scan.nextInt();
            donations += rate * jumps;
        }
        int dollars = (int) donations;
        int cents = (int) (((donations - (double) dollars) * 100));
        System.out.println("$" + dollars + "." + cents + " is the total");
    }
}
