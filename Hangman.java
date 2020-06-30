//Nancy
import java.util.*;
public class Hangman
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("type the word");
        String word = scan.nextLine();
        for(int i = 0; i < 100; i++){System.out.println();}
        word = word.toLowerCase();
        boolean [] arr = new boolean [word.length()];
        for(int i = 0; i < word.length(); i++){arr[i] = false;}
        final int lives = 10;
        int wrongs = 0;
        boolean won = false;
        String guesses = "";
        while (!won && wrongs < 10){
            for (int i = 0; i < word.length(); i++){
                if (arr[i] == false){ System.out.print("_ ");}
                else{System.out.print(word.charAt(i) + " ");}
            }
            System.out.println();
            System.out.println("guess a letter");
            String guess = scan.nextLine();
            guess = guess.toLowerCase();
            if (guesses.indexOf(guess) == -1){
                guesses = guesses.concat(guess);
                if (word.indexOf(guess) != -1){
                    for (int i = 0; i < word.length(); i++){
                        if (word.substring(i, i+1).equals(guess)){ arr[i] = true;}
                    }
                }
                else {
                    wrongs ++;
                    System.out.println("No " + guess + ". " + (lives-wrongs) + " left.");
                }
                int left = word.length();
                for (int i = 0; i < word.length(); i++){
                    if (arr[i]){ left --;}
                }
                if(left == 0){won = true;}
            }
            else {
                System.out.println("You have already guessed that." +
                "Restarting round.");
            }
        }
        if(won){System.out.println("Congrajulations! " + word + " is correct!");}
        else{System.out.println("You have been hanged.");}
    }
}
