//Nancy

/* Given the user input, n, print a triangle of * where the first row has 
 * 1 star and the last row has n stars but the stars are aligned to the right.
           *
          **
         ***
        ****
 */
import java.util.*;
public class Stars3
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter an integer for the triangle's base.");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
