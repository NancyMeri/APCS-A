//Nancy

/* Given the user input, n, print a triangle of digits where the first row 
 * prints 1, the second prints 12,…, and the last row prints the values 1 
 * through n. 
 */
import java.util.*;
public class Numbers2
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Input the length of the base");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
