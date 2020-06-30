//Nancy
import java.util.*;
public class Dictionary
{
    public static void main (String [] args){
        ArrayList<Word> words = new ArrayList();
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the dictionary");
        int a = 9;
        while (a !=6){
            System.out.println("Menu:");
            System.out.println("1: add a new word & definition");
            System.out.println("2: remove a word & definition");
            System.out.println("3: change a definition to a word");
            System.out.println("4: get the definition of a word");
            System.out.println("5: display all the words and the number of words");
            System.out.println("6: quit");
            a = scan.nextInt();
            scan.nextLine();
            if (a == 1){
                System.out.println("What's the word?");
                String w = scan.nextLine();
                System.out.println("What's the definition?");
                String d = scan.nextLine();
                Word word1 = new Word (w, d);
                words.add(word1);
            }
            else if (a == 2){
                System.out.println("What's the word?");
                String w = scan.nextLine();
                boolean ans = false;
                for (int i = 0; i < words.size(); i++){
                    if (words.get(i).getWord().equals (w)){
                        words.remove(i);
                        ans = true;
                    }
                }
                if (!ans){System.out.println("That's not in the dictionary");}
            }
            else if (a == 3){
                System.out.println("What's the word?");
                String w = scan.nextLine();
                boolean ans = false;
                for (int i = 0; i < words.size(); i++){
                    if (words.get(i).getWord().equals (w)){
                        System.out.println("What's the new definition?");
                        words.get(i).setDef(scan.nextLine());
                        ans = true;
                    }
                }
                if (!ans){System.out.println("That's not in the dictionary");}
            }
            else if (a == 4){
                System.out.println("What's the word?");
                String w = scan.nextLine();
                boolean ans = false;
                for (int i = 0; i < words.size(); i++){
                    if (words.get(i).getWord().equals (w)){
                            System.out.println(words.get(i).getDef());
                            ans = true;
                    }
                }
                if (!ans){System.out.println("That's not in the dictionary");}
            }
            else if (a == 5){
                System.out.println("Words:");
                for (int i = 0; i < words.size(); i++){
                    System.out.println(words.get(i).getWord());
                }
                System.out.println("There are " + words.size() + " words.");
            }
            else{
                a = 6;
            }
        }
    }
}
