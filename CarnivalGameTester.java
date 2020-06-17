//Nancy

import java.util.*;
public class CarnivalGameTester
{
    public static void main (String [] args){
        //use a scanner to get input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Dice Game!");
        CarnivalGameLab Dice = new CarnivalGameLab();
        System.out.println("The dice have been rolled.");
        System.out.println("If you want to keep the original value of the dice, press 0.");
        System.out.println("If you want to re-roll the first die, press 1.");
        System.out.println("If you want to re-roll the second die, press 2.");
        System.out.println("To see the value of the first die, press 3.");
        System.out.println("To see the value of the second die, press 4.");
        System.out.println("If you want to re-roll both dice, press 5.");
        System.out.println("If you want to end the game, press 10.");
        //do some other necessary things
        // what do you want to do?
        //roll die 1
            //roll die 2
            //10. end game
        //user input w/ scanner & set it equal to a variable
        int choice = scan.nextInt();
        while (choice != 10){
            if (choice == 0){ System.out.println("You've kept the dice");}
            else if (choice == 1){ 
                Dice.rollDieOne();
                System.out.println("You rolled die one.");
            }
            else if (choice == 2){ 
                Dice.rollDieTwo();
                System.out.println("You rolled die two.");
            }
            else if (choice == 3){
                System.out.println("The value of die one is " + Dice.getDieOne());
            }
            else if (choice == 4){
                System.out.println("The value of die two is " + Dice.getDieTwo());
            }
            else if (choice == 5){
                Dice.roll();
                System.out.println("You rolled both dice");
            }
            // if else statements that call methods
            // change condition
            //SOP ask user for next choice
            System.out.println("Press a number to indicate what you'd like to do next.");
            choice = scan.nextInt();
        }
        System.out.println("The final two die were " + Dice.getDieOne() + " and " + Dice.getDieTwo());
        System.out.println("Your winnings are " + Dice.winnings() + "! Good game");
    }
}
