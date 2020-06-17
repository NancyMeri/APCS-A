//Nancy

public class CarnivalGameLab
{
    private int die1;
    private int die2;
    
    public CarnivalGameLab (){
        die1 = (int)(Math.random() * 6) + 1; //die1 has 6 faces
        die2 = (int)(Math.random() * 11) + 1; //die2 has 11 faces
    }
    
    public void rollDieOne (){
        die1 = (int)(Math.random() * 6) + 1; //die1 has 6 faces
    }
    
    public void rollDieTwo (){
        die2 = (int)(Math.random() * 11) + 1; //die2 has 11 faces
    }
    
    public void roll (){
        die1 = (int)(Math.random() * 6) + 1; //die1 has 6 faces
        die2 = (int)(Math.random() * 11) + 1; //die2 has 11 faces
    }
    
    public int getDieOne (){
        return die1;
    }
    
    public int getDieTwo (){
        return die2;
    }
    
    public String winnings (){
        int money;
        if (die1 == die2){
            money = 25 * die1 * die2;
        }
        else {
            money = 10 * (Math.abs(die1 - die2));
        }
        int dollars = money / 100;
        int cents = money % 100;
        return "$" + dollars + "." + cents;
    }
}
