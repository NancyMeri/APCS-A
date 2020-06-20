//Nancy
import java.util.*;
public class TaxLabTester
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your income?");
        int income = scan.nextInt();
        System.out.println("How many children do you have?");
        int children = scan.nextInt();
        scan.nextLine();
        System.out.println("Are you single or married?");
        String status = scan.nextLine().toLowerCase();
        TaxLab person1 = new TaxLab(income, status, children);
        double taxes = person1.getTaxes();
        System.out.println("You need to pay $" + taxes + " in taxes");
    }
}
