//Nancy
import java.util.*;
public class War
{
    public static void main (String [] args){
        int [] hand1 = new int [26];
        int [] hand2 = new int [26];
        for (int i = 0; i < 26; i++){
            hand1[i] = (int) (Math.random() * 14) + 1;
            hand2[i] = (int) (Math.random() * 14) + 1;
        }
        System.out.print("Player 1 has [");
        for (int i = 0; i < 25; i++){
            if (hand1[i] > 10){
                if (hand1[i] == 11){System.out.print("J, ");}
                else if (hand1[i] == 12){System.out.print("Q, ");}
                else if (hand1[i] == 13){System.out.print("K, ");}
                else{System.out.print("A, ");}
            }
            else {System.out.print(hand1[i] + ", ");}
        }
        if (hand1[25] > 10){
                if (hand1[25] == 11){System.out.print("J]");}
                else if (hand1[25] == 12){System.out.print("Q]");}
                else if (hand1[25] == 13){System.out.print("K]");}
                else{System.out.print("A]");}
            }
        else{System.out.println(hand1[25] + "]");}
        System.out.print("Player 2 has [");
        for (int i = 0; i < 25; i++){
            if (hand2[i] > 10){
                if (hand2[i] == 11){System.out.print("J, ");}
                else if (hand2[i] == 12){System.out.print("Q, ");}
                else if (hand2[i] == 13){System.out.print("K, ");}
                else{System.out.print("A, ");}
            }
            else{System.out.print(hand2[i] + ", ");}
        }
        if (hand2[25] > 10){
                if (hand2[25] == 11){System.out.print("J]");}
                else if (hand2[25] == 12){System.out.print("Q]");}
                else if (hand2[25] == 13){System.out.print("K]");}
                else{System.out.print("A]");}
            }
        else{System.out.println(hand2[25] + "]");}
        int wins1 = 0;
        int wins2 = 0;
        int ties = 0;
        for (int i = 0; i < 26; i++){
            System.out.println("Round " + (i + 1) + ":");
            System.out.print("Player 1: ");
            if (hand1[i] > 10){
                if (hand1[i] == 11){System.out.println("J");}
                else if (hand1[i] == 12){System.out.println("Q");}
                else if (hand1[i] == 13){System.out.println("K");}
                else{System.out.println("A");}
            }
            else{System.out.println(hand1[i]);}
            
            System.out.print("Player 2: ");
            if (hand2[i] > 10){
                if (hand2[i] == 11){System.out.println("J");}
                else if (hand2[i] == 12){System.out.println("Q");}
                else if (hand2[i] == 13){System.out.println("K");}
                else{System.out.println("A");}
            }
            else{System.out.println(hand2[i]);}
            
            if (hand1[i] > hand2[i]){
                System.out.println("Player 1 wins!");
                wins1 ++;
            }
            else if (hand1[i] < hand2[i]){
                System.out.println("Player 2 wins!");
                wins2 ++;
            }
            else{
                System.out.println("Tie!");
                ties ++;
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Totals:");
            System.out.println("Player 1: " + wins1);
            System.out.println("Player 2: " + wins2);
            System.out.println("Ties: " + ties);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
        System.out.println("Game over!");
        if(wins1 > wins2){System.out.println("Player 1 won!");}
        else if(wins1 < wins2){System.out.println("Player 3 won!");}
        else{System.out.println("Tie!");}
    }
}
