//Hi it's Nancy
import java.util.*;
public class LabPart2
{
    public static void main (String [] args){
        int numberRight = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("It's time for a quiz!");
        System.out.println("Question 1: which of the following is a cephalopod?");
        System.out.println("1) sea cucumber");
        System.out.println("2) cuttlefish");
        System.out.println("3) coral");
        System.out.println("4) T rex");
        int ans1 = scan.nextInt();
  
        if (ans1 == 2){
            System.out.println("That's right!");
            numberRight ++;
        }
        else {
            System.out.println("Nope.");
        }
        
        System.out.println("Question 2: what is dihydrogen monoxide?");
        System.out.println("1) an acid");
        System.out.println("2) a base");
        System.out.println("3) water");
        System.out.println("4) nothing- it doesn't exist");
        int ans2 = scan.nextInt();
  
        if (ans2 == 3){
            System.out.println("That's right!");
            numberRight ++;
        }
        else {
            System.out.println("Nope.");
        }
        
        System.out.println("Question 3: what is the 26th element on the periodic table?");
        System.out.println("1) iron");
        System.out.println("2) zinc");
        System.out.println("3) copper");
        System.out.println("4) cobalt");
        int ans3 = scan.nextInt();
  
        if (ans3 == 1){
            System.out.println("That's right!");
            numberRight ++;
        }
        else {
            System.out.println("Nope.");
        }
        
        System.out.println("You got " + numberRight +"/3 correct!");
    }
}
