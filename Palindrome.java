// Nancy

/* Write a method-- public boolean isPalindrome (String word) -- that tests 
 * whether word is a palindrome (the same when read forward or backward, as 
 * in “madam”). Test isPalindrome using a test program. Upgrade isPalindrome 
 * so that it can hand any phrase (as in “Madam, I’m Adam”). In testing for a
 * palindrome, disregard all spaces, punctuation marks, apostrophes, and other 
 * non-alphanumeric characters and consider lower- and uppercase letters the 
 * same. Do not count an empty string as a palindrome. (Remember the character 
 * class has static methods boolean isLetterOrDigit (ch) and char 
 * toUpperCase(ch)!)
 */

import java.util.*;
public class Palindrome
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please input a string");
        String str = scan.nextLine();
        str = str.toLowerCase();
        str = str.trim();
        int y = str.length();
        int x = 0;
        while(x < y){
            if (Character.isLetterOrDigit(str.charAt(x)) == false){
                str = str.substring(0, x) + str.substring (x + 1);
            }
            else{ x++;}
            y = str.length();
        }
        
        y = str.length() - 1;
        int z = 0;
        boolean palindrome = true;
        while (z <= y && palindrome == true){
            if (str.charAt(z) != str.charAt(y)){
                palindrome = false;
            }
            z++;
            y--;
        }
        if (palindrome) {
            System.out.println("Yes! That's a palindrome!");
        }
        else {
            System.out.println("Not a palindrome.");
        }
    }
}
