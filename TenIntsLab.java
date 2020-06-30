//Nancy
import java.util.*;
public class TenIntsLab
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        int []  arr = new int [10];
        for (int i = 0; i < 10; i++){
            arr [i] = (int) (Math.random() * 10 + 1);
            System.out.print(arr[i] + " ");
        }
        System.out.println("Type an integer");
        int x = scan.nextInt();
        int count = 0;
        for (int i = 0; i < 10; i++){
            if (arr [i] == x) {count ++;;}
        }
        System.out.println(x + " appears " + count + " times in this array");
    }
}
