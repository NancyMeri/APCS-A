

public class CoffeePot {
    // first thing is fields-- availalbe always (unlike constructors)
    private int cups;
    private String blend;
    
    //next thing is constructors
    public CoffeePot (){ //default constructor has no parameters
        cups = 12;
        blend = "Dunkin' Donuts Original Blend";
    }
    //another constructor (only cups)
    public CoffeePot (int numCups){
        cups = numCups;
        blend = "Dunkin' Donuts Original Blend";
    }
    //another constructor (only blend)
    public CoffeePot (String specialBlend){
        cups = 12;
        blend = specialBlend;
    }
    //another constructor (cups and blend)
    public CoffeePot (int numCups, String specialBlend){
        cups = numCups;
        blend = specialBlend;
    }
    
    //next thing is additional methods:
    public void pourCup (){ //pours a single cup of coffee
        //void b/c no return type b/c not returning anything
        //also no parameters so () are empty
        cups--; //also could do 'cups = cups -1;' or 'cups -= 1;'
    }
    public void fillPot (String specificBlend){ 
        //parameter could have the same name as before 'specialBlend'
        cups = 12;
        blend = specificBlend; //ask about THIS LINE
   
    }
    public void fillPot (){
        cups = 12;
    }
    
    //getter methods, accessor methods
    
    public int getCups (){ //returns # of cups
        //usually getter methods have something like 'get' in name
        return cups;
    }
    
    public String getBlend (){ //returns current blend name
        return blend;
    }
    
}