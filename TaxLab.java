//Nancy

public class TaxLab
{
    private int dependents;
    private String personType;
    private int percentage;
    private int income;
    private int deduction;
    
    public TaxLab(int income, String status, int kids){
        dependents = kids;
        if (status.equals("married")) { personType = "married individuals";}
        else {
            if (kids == 0) { personType = "single individual";}
            else { personType = "head of household";}
        }
        this.income = income;
        setPercentage();
    }
    
    public void setPercentage (){
        if (personType.equals("single individual")){
            deduction = 12400;
            if (income > 518400) {percentage = 37;}
            else if (income > 207350) {percentage = 35;}
            else if (income > 163300) {percentage = 32;}
            else if (income > 85525) {percentage = 24;}
            else if (income > 40125) {percentage = 22;}
            else if (income > 9875) {percentage = 12;}
            else { percentage = 10;}
        }
        else if (personType.equals("married individuals")){
            deduction = 24800;
            if (income > 622050) {percentage = 37;}
            else if (income > 414700) {percentage = 35;}
            else if (income > 326600) {percentage = 32;}
            else if (income > 171050) {percentage = 24;}
            else if (income > 80250) {percentage = 22;}
            else if (income > 19750) {percentage = 12;}
            else { percentage = 10;}
        }
        else {
            deduction = 18650;
            if (income > 518400) {percentage = 37;}
            else if (income > 207350) {percentage = 35;}
            else if (income > 163300) {percentage = 32;}
            else if (income > 85500) {percentage = 24;}
            else if (income > 53700) {percentage = 22;}
            else if (income > 14100) {percentage = 12;}
            else { percentage = 10;}
        }
    }
    
    public double getTaxes(){
        double multiply = (double) percentage / 100;
        double taxes = income * multiply;
        taxes -= deduction;
        return taxes;
    }
}
