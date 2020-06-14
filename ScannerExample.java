
import java.util.*; // * imports everything in util, as opposed to one class
public class ScannerExample {
   public static void main (String [] args){
       //scanner is an object
       Scanner scan = new Scanner (System.in); // declares Scanner named scan
       System.out.println ("Please enter your age: ");
       int age = scan.nextInt(); //sets age = the integer inputted
       System.out.println ("Your age is " + age);
       
       scan.nextLine(); //clears out the extra line after the int DWAI
       
       System.out.println ("Please enter your name: ");
       String name = scan.nextLine(); //sets name = whole inputted line
       System.out.println ("Your name is " + name);
    }
}