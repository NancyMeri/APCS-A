//Nancy
/* Have the user input a String (word, phrase, sentence, paragraph, etc) 
 * and indicate a letter of interest. Use a for loop to determine and print 
 * out how many times that letter appears in the String.
 */
import java.util.*;
public class NumberOfLetter
{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a string");
        String str = scan.nextLine();
        System.out.println("Please indicate a letter of interest");
        String letter = scan.nextLine();
        int length = str.length();
        int number = 0;
        for (int i = 0; i < length; i++){
            if (str.substring(i, i+1).equals(letter)){
                number ++;
            }
        }
        System.out.println(letter + " appears " + number + " times in " +
        str);
    }
}
