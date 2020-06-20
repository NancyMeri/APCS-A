//Nancy
import java.util.*;
public class TicketLabTester
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        String input = " ";
        int end = 1;
        //int customer = 1;
        while (end != 0){
            System.out.println("New customer");
            System.out.println("How many tickets would you like to buy?");
            int num = scan.nextInt();
            scan.nextLine();
            System.out.println();
            for (int i = 1; i <= num; i++){
                TicketLab ticket;
                System.out.println("What ticket type? Press 0 to leave blank");
                input = scan.nextLine();
                System.out.println();
                if (input.equals("0")){
                    ticket = new TicketLab();
                }
                else {
                    ticket = new TicketLab(input);
                }
                System.out.println(ticket.toString());
            }
            System.out.println("If that was your last customer, press 0."
            + "Press any number to continue.");
            end = scan.nextInt();
            System.out.println();
        }
        System.out.println("You sold " + TicketLab.getTotalTickets() +
        " tickets for $" + TicketLab.getTotalDollars());
        System.out.println("You sold " + TicketLab.getNumWalkUps() + 
        " Walk Up tickets,");
        System.out.println(TicketLab.getNumStudentAdvances() + 
        " Student Advance tickets, ");
        System.out.println("and " + TicketLab.getNumAdvances() + 
        " Non-Student Advance tickets.");
    }
}
