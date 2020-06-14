//this is Lunch Time!
/*Write a short class LunchTime with no fields, no constructors, and
 * just one static main method. Given two integers for the current time 
 * (hours and minutes before 1PM), the method should print the number 
 * of minutes left until lunch, which is schedule at 1PM.
 */
import java.util.*;
public class LunchTime{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in); //creates new scanner
        System.out.println("Input current hour");
        int hoursNow = scan.nextInt();
        System.out.println("Input current minutes since hour");
        int minutesNow = scan.nextInt();
        int hoursTillLunch = 12 - hoursNow; //12 so it doesn't add an hour when minutes exist
        int minutesTillLunch = 60 - minutesNow;
        System.out.println("Lunch is in " + hoursTillLunch + " hours and " + minutesTillLunch + " minutes");
        //previous line prints formatted string.
    }
}

