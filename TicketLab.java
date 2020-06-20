//Nancy

public class TicketLab
{
    private static int totalTickets = 0;
    private static int serialNumber = 10000;
    private static int totalDollars = 0;
    private static int numWalkUps = 0;
    private static int numStudentAdvances = 0;
    private static int numAdvances = 0;
    private int daysAhead;
    private String ticketType;
    private int ticketCost;
    private boolean isStudent;
    
    public TicketLab (){
        daysAhead = 0;
        ticketType = "Walk Up";
        numWalkUps ++;
        totalTickets ++;
        serialNumber ++;
        ticketCost = findPrice();
        totalDollars += ticketCost;
    }
    public TicketLab (String ticketType){
        this.ticketType = ticketType;
        if (ticketType.equals("WalkUp")){
            daysAhead = 0;
            numWalkUps ++;
            isStudent = false; //here I just picked an automatic one
        }
        else { daysAhead = 10;//here I just picked an automatic one
            if (ticketType.equals("StudentAdvance")){
                isStudent = true;
                numStudentAdvances ++;
            }
            else{
                isStudent = false;
                numAdvances ++;
            }
        }
        totalTickets ++;
        serialNumber ++;
        ticketCost = findPrice();
        totalDollars += ticketCost;
    }
    private int findPrice (){
        if (daysAhead == 0)
            ticketCost = 50;
        else{
            if (daysAhead < 10)
                ticketCost = 40;
            else
                ticketCost = 30;
            if (isStudent)
                ticketCost /= 2;
        }
         return ticketCost;
    }
    /* unnecessary mutator methods
    public void pickSerialNum (int serialNumber){
        this.serialNumber = serialNumber;
    }
    public void changeDaysAhead (int daysAhead){
        daysAhead = this.daysAhead;
    }
    public void changeStudent (boolean isStudent){
        isStudent = this.isStudent;
    }
    */
    public static int getTotalTickets(){
        return totalTickets;
    }
    public static int getNumWalkUps(){
        return numWalkUps;
    }
    public static int getNumStudentAdvances(){
        return numStudentAdvances;
    }
    public static int getNumAdvances(){
        return numAdvances;
    }
    public static int getTotalDollars(){
        return totalDollars;
    }
    public static int getSerialNum(){
        return serialNumber;
    }
    public int getDaysAhead(){
        return daysAhead;
    }
    public int getTicketCost(){
        return ticketCost;
    }
    public boolean getStudent(){
        return isStudent;
    }
    public String toString (){
        return serialNumber + " " + daysAhead + " " + ticketCost + " " + isStudent;
    }
}
