//Nancy

/* Write a program that will allow a user to order a certain type of meat. 
 * You may choose the types of meat available at your shop, but you must 
 * have at least 3 different types. Once the user has chosen a meat type, 
 * allow them to purchase a certain number of pounds of that meat. 
 * Calculate and display the cost. Allow the user to repeat this process 
 * until they want to stop. Maintain a current balance at all times.
 */
import java.util.*;
public class DeliMarket
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the Deli Market!");
        int x = 1;
        double bal = 0.0;
        while (x != 0){
            System.out.println("You can purchase 3 types of meat here.");
            System.out.println("Meat 1 is chicken, which is $4.75 per lb.");
            System.out.println("Meat 2 is beef, which is $9.25 per lb.");
            System.out.println("Meat 3 is pea protien, which is $2.50 per lb.");
            System.out.println("Type 0 when you are ready to check out.");
            x = scan.nextInt();
            if (x == 1){
                System.out.println("How many pounds of chicken would you like?");
                double lbs = scan.nextDouble();
                bal += (4.75 * lbs);
            }
            else if (x == 2){
                System.out.println("How many pounds of beef would you like?");
                double lbs = scan.nextDouble();
                bal += (9.25 * lbs);
            }
            else if (x == 3){
                System.out.println("How many pounds of pea protien would you like?");
                double lbs = scan.nextDouble();
                bal += (2.50 * lbs);
            }
            bal = (int) (bal * 100);
            bal = (double) bal / 100;
            System.out.println("Your balance is now $" + bal);
        }
        System.out.println("You paid $" + bal);
        System.out.println("Thank you for shopping with us.");
    }
}
