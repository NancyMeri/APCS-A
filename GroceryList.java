//Nancy
import java.util.*;
public class GroceryList
{
    public static void main (String [] args){
        ArrayList<String> groceries = new ArrayList();
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to your grocery list! It is currently empty");
        int q = 9;
        while (q != 5){
            System.out.println("Menu:");
            System.out.println("1: Add an item to the list");
            System.out.println("2: Remove an item on the list");
            System.out.println("3: Replace an item on the list");
            System.out.println("4: Display the list and the total number of items on it");
            System.out.println("5: Quit");
            q = scan.nextInt();
            scan.nextLine();
            if (q == 1){
                System.out.println("What would you like to add?");
                groceries.add(scan.nextLine());
            }
            else if (q == 2){
                System.out.println("What would you like to remove?");
                String r = scan.nextLine();
                if (groceries.contains(r)){ groceries.remove(r);}
                else{System.out.println("That's not on the list");}
            }
            else if (q == 3){
                System.out.println("What index?");
                int i = scan.nextInt();
                scan.nextLine();
                System.out.println("What would you like " + i + " to be?");
                groceries.set(i, scan.nextLine());
            }
            else{
                System.out.println(groceries);
                System.out.println("Number" + groceries.size());
            }
        }
    }
}
