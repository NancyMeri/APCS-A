//Nancy

import java.util.*;
public class PythagoreanTriple
{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("type an integer");
        int m = scan.nextInt();
        System.out.println("type another integer");
        int n = scan.nextInt();
        int [] pyth = MakePythagoreanTriple(m, n);
        for (int i = 0; i < 3; i++){
            System.out.print(pyth[i] + " ");
        }
    }

    public static int[] MakePythagoreanTriple (int m, int n){
        if (n > m){
            int temp = n;
            n = m;
            m = temp;
        }
        int a = (m * m) - (n * n);
        int b = 2 * m * n;
        int c = (m * m) + (n * n);
        if (a > b){
            int t = a;
            a = b;
            b = t;
        }
        int [] arr = {a, b, c};
        return arr;
    }
}
