//Nancy

/* Given the user input, n, print a nxn square of *.
       ****
       ****
       ****
       **** 
 */
import java.util.*;
public class Stars1
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter an integer for the square's dimensions.");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
