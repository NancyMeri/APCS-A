

public class CoffeePotTester{
    public static void main (String [] args){
        //type (aka classname) variableName = new type (parameters);
        CoffeePot caffy = new CoffeePot (3, "decaf");
        
        //dot operator is a .
        //objectName.whateverMethodYouAreCalling (parameters)
        System.out.println ("Number of cups: " + caffy.getCups());
        
        System.out.println ("Blend: " + caffy.getBlend());
        
    }
    
}