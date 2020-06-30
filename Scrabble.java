//Nancy
import java.util.*;
public class Scrabble
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("please enter a word");
        String word = scan.nextLine();
        System.out.println(ComputeScore(word));
    }
    public static int ComputeScore (String word){
        word = word.toLowerCase();
        int l = word.length();
        int [] value = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        String alpha = ("abcdefghijklmnopqrstuvwxyz");
        int total = 0;
        for (int i = 0; i < l; i++){
            total += value[alpha.indexOf(word.charAt(i))];
        }
        return total;
    }
}
