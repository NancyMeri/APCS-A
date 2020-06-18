//Nancy

/* Given the user input, n, print a triangle of all stars in a pyramid 
 * formation. 
 */
import java.util.*;
public class Bonus
{
    public static void main (String [] args){
       Scanner scan = new Scanner (System.in);
       System.out.println("Please input the number of stars of the base?");
       int n = scan.nextInt(); 
       for (int i = 1; i <= n; i ++){
           for (int j = 1; j <= (n-i); j++){
             System.out.print(" ");
           }
           for (int k = 1; k <= i; k++){
               System.out.print("* ");
           }
           for (int l = 1; l <= (n-i); l++){
             System.out.print(" ");
           }
           System.out.println();
       }
    }
}
