
import java.util.*;
public class AdventureLab
{
    /*
     * Directions: You are tasked with making a short “Choose Your 
Own Adventure” story. You should decide on a plot and use a scanner
for the user to make a decision to further the story. You may write
all your code in one main method, or if you would like to reuse code,
you can write the code for each situation in a separate method and
then call the methods. 

You should use the following four methods 
at least once in deciding the next step of your story- 
.equals(), .length(), .substring(int) or .substring (int, int), 
and .indexOf(String). Be creative and have fun!
     */
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play hangman! Person one, please enter the word (no spaces, no repeat letters)");
        String word = scan.nextLine();
        System.out.println(word);
        //enter down several lines so the second person can't see it
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        
        System.out.println("Person 2 can come to the computer now");
        System.out.println("You have 10 guesses");
        int l = word.length();
        int x = 0;
        String store = ("");
        while (x < l){
            store = store.concat("_");
            x += 1;
        }
        
        boolean win = false;
        int lives = 10;
        String guess = "";
        
        while (win == false && lives > 0){
            System.out.println(store);
            System.out.println(" ");
            System.out.println("Enter a guess-- letter, part of a word, or whole word");
            guess = scan.nextLine();
            int len = guess.length();
            if (guess.equals(word)){
                win = true;
            }
            else if (word.indexOf(guess) != -1){
                if (len > 1){
                    int s = word.indexOf(guess);
                    int e = (word.indexOf(guess) + len);
                    store = store.substring(0, s) + word.substring (s, e)
                    + store.substring(e);
                }
                else {
                    if (word.length() == word.indexOf(guess) + 1){
                        int s = word.indexOf(guess);
                        store = store.substring(0, s) + word.substring(s);
                    }
                    else {
                        int s = word.indexOf(guess);
                        int e = s+1;
                        store = store.substring(0, s) + word.charAt(s)
                        + store.substring(e);
                    }
                }
                
            }
            else {
                lives -= 1;
                System.out.println("Nope. Lives: " + lives);
            }
            
            if (store.equals(word)){
                win = true;
            }
            
            if (win == true){
                System.out.println("Congratulations! " + word + " is the word!");
            }
        
            if (lives == 0){
                System.out.println("I'm sorry-- you ran out of lives");
            }
        }
    }
}
