//Nancy

/* Given the user input, n, print a triangle of digits where the first row 
 * has one 1, the second has two 2’s, …, and the last row has n n’s.
        1
        22
        333
        4444
 */
import java.util.*;
public class Numbers1
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter an integer for the biggest number");
        int n = scan.nextInt();
        for (int i = 1; i >= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
