//Nancy
import java.util.*;
public class DieCup
{
    private Die [] dice;
    private int [] values = new int [7];
    public DieCup (int number){
        dice = new Die [number];
        rollDie (number);
    }
    public void rollDie (int number){
        
        for (int i = 0; i < 7; i++)
            values[i] = 0;
        for (int i = 0; i < number; i++){
            dice [i] = new Die();
            dice[i].roll();
            values[dice[i].getNumDots()] ++;
        }
    }
    public int [] getValues (){
        return values;
    }
    public boolean yahtzee (){
        boolean a = true;
        for (int k = 1; k < 7; k ++){
            if (values[k] > 0){
                for (int i = 1; i < 7; i++){
                    if (values[i] > 0 && i != k)
                        a = false;
                    }
                }
            }
        return a;
    }
    public String toString (){
        //format print dice too
        String ans = "Dice: ";
        for (Die x: dice){
            ans += x.getNumDots();
            ans += " ";
        }
        ans += "which is ";
        ans += values[1];
        ans += " ones, ";
        ans += values[2];
        ans += " twos, ";
        ans += values[3];
        ans += " threes, ";
        ans += values[4];
        ans += " fours, ";
        ans += values[5];
        ans += " fives, and ";
        ans += values[6];
        ans += " sixes.";
        return ans;
    }
}
