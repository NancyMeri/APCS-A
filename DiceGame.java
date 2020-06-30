//Nancy
import java.util.*;
public class DiceGame
{
    public static void main (String [] args){
        ArrayList <DieCup> dices = new ArrayList <DieCup> (0);
        Scanner scan = new Scanner (System.in);
        int ans = 9;
        int count = 0;
        while (ans != 0){
            System.out.println("Please enter a number of dice, or 0 to end the game");
            ans = scan.nextInt();
            dices.add(new DieCup(ans));
            dices.get(count).rollDie(ans);
            int [] ret = (dices.get(count).getValues());
            for (int x : ret){
                System.out.println(x);
            }
            System.out.println(dices.get(count).toString());
            if (dices.get(count).yahtzee()){ 
                System.out.println("Yahtzee!");
            }
            count++;
        }
        System.out.println("Second turn:");
        if (dices.get(1).yahtzee()){ 
                System.out.println("Yahtzee!");
        }
        else
            System.out.println("No yahtzee.");
    }
}
