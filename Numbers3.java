//Nancy
/* Given the user input, n, print a triangle of all the digits starting at 1 
 * and increasing by 1, where each row has the same number of digits as the 
 * row number
 */

import java.util.*;
public class Numbers3
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Input the length of the base");
        int n = scan.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
              System.out.print(count);
              count ++;
            }
            System.out.println();
        }
    }
}
