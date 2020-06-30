//Nancy

import java.util.*;
public class FibonacciLab
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("type an integer");
        int x = scan.nextInt() + 1;
        int [ ] arr = FibonacciLab(x);
        for (int i = 0; i < x; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] FibonacciLab (int length){
        int [ ] fib = new int [length];
        
        for (int i = 1; i < length; i++){
            if (i < 3) {fib[i] = 1;}
            else {fib[i] = (fib[i-1] + fib[i-2]);}
        }
        return fib;
    }
}
