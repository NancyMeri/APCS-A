//Nancy
import java.util.*;
public class ATMLab
{
    private static final String USERNAME = "human1";
    private static final int PIN = 7779;
    
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        int x = 0;
        String user = "";
        int p = 0;
        while (x < 3 && user != USERNAME && p != PIN){
            System.out.println("Please enter your username");
            user = scan.nextLine();
            System.out.println("Please enter your pin");
            p = scan.nextInt();
        }
        double balance = 100.;
        if (x == 3){System.out.println("Account temporarily locked");}
        else{
            int choice = 0;
            System.out.println("Welcome to your account");
            while (choice != 4){
                System.out.println("Here are your options:");
                System.out.println("1) Check account balance");
                System.out.println("2) Deposit checks");
                System.out.println("3) Withdraw money");
                System.out.println("4) Logout");
                choice = scan.nextInt();
                if (choice < 1 || choice > 4){System.out.println("Invalid");}
                else {
                    if (choice == 1){System.out.println("Balance is $ "+ balance);}
                    else if (choice == 2){
                        System.out.println("How many checks?");
                        int numChecks = scan.nextInt();
                        int z = 1;
                        while (z <= numChecks){
                            System.out.println("What is the dollar amount "
                            + "of check " + z);
                            balance += scan.nextDouble();
                            z++;
                        }
                    }
                    else if (choice == 3){
                        System.out.println("How much would you like to "
                        + "withdraw? Note: only increments of $20 are allowed.");
                        double withdrawel = scan.nextDouble();
                        if (withdrawel > balance){
                            System.out.println("You don't have that much");
                        }
                        else if (withdrawel % 20 != 0){
                            System.out.println("Not an increment of 20.");
                        }
                        else{
                            balance -= withdrawel;
                            System.out.println("Ok. Your balance is now $"
                            + balance);
                        }
                    }
                    else {
                       System.out.println("You are now logged out"); 
                    }
                }
            }
        }
    }
}
