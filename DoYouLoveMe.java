//Nancy

/* Write a program that allows a user to enter the number of petals on a 
 * flower. Then one by one, print “plucking petal #1: he loves me!”. 
 * Alternate “He loves me” and “He loves me not” as well as increase the 
 * petal number for each petal.
 */
import java.util.*;
public class DoYouLoveMe
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("How many petals on the flower?");
        int n = scan.nextInt();
        int p = 1;
        while (p <= n){
            System.out.print("plucking petal #" + p);
            if (p % 2 != 0){
                System.out.println(": he loves me!");
            }
            else{
                System.out.println(": he loves me not.");
            }
            p++;
        }
    }
}
