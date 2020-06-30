//Nancy
import java.util.*;
public class TicTacToe
{
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println();
        System.out.println("Welcome to Tic Tac Toe");
        String arr [] [] = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}};
        System.out.println("Who is X?");
        String x = s.nextLine();
        System.out.println("Who is O?");
        String o = s.nextLine();
        int end = 9;
        boolean won = false;
        boolean nowX = true;
        int p;
        while (!won){
            print (arr);
            System.out.println("It's " + x + "'s turn.");
            turn ("x", arr);
            for (int k = 0; k < 100; k++){
                System.out.println();
            }
            print (arr);
            System.out.println("It's " + o + "'s turn.");
            turn ("o", arr);
            for (int k = 0; k < 100; k++){
                System.out.println();
            }
            print (arr);
            System.out.println("It's " + x + "'s turn.");
            turn ("x", arr);
            for (int k = 0; k < 100; k++){
                System.out.println();
            }
            print (arr);
            System.out.println("It's " + o + "'s turn.");
            turn ("o", arr);
            for (int k = 0; k < 100; k++){
                System.out.println();
            }
            print (arr);
            System.out.println("It's " + x + "'s turn.");
            turn ("x", arr);
            for (int k = 0; k < 100; k++){
                System.out.println();
            }
            print (arr);
            System.out.println("It's " + o + "'s turn.");
            turn ("o", arr);
            for (int k = 0; k < 100; k++){
                System.out.println();
            }
            print (arr);
            System.out.println("It's " + x + "'s turn.");
            turn ("x", arr);
            for (int k = 0; k < 100; k++){
                System.out.println();
            }
            print (arr);
            System.out.println("It's " + o + "'s turn.");
            turn ("o", arr);
            for (int k = 0; k < 100; k++){
                System.out.println();
            }
            print (arr);
            System.out.println("It's " + x + "'s turn.");
            turn ("x", arr);
            for (int k = 0; k < 100; k++){
                System.out.println();
            }
            print (arr);
            System.out.println("Draw.");
        }
    }
    public static String [] [] turn(String player, String [] [] arr){
        Scanner s = new Scanner (System.in);
        String ans [] [] = arr;
        String a;
        if (player.equals("x")){a = "X";}
        else{a = "O";}
        System.out.println("What is the row index you'd like to mark?");
        int r = s.nextInt();
        System.out.println("What is the column index you'd like to mark?");
        int c = s.nextInt();
        ans [r] [c] = a;
        return ans;
    }
    public static void print(String [] [] arr){
        for (String [] x : arr){
            System.out.println();
            for (String y : x){
                System.out.print(y + " ");
            }
        }
    }
    public static boolean won(String [] [] arr){
        boolean won = false;
        if(arr [0] [0] == arr [0] [1] && arr [0] [0] == arr [0] [2]){won = true;}
        else if(arr [1] [0] == arr [1] [1] && arr [1] [0] == arr [1] [2]){won = true;}
        else if(arr [2] [0] == arr [2] [1] && arr [2] [0] == arr [2] [2]){won = true;}
        else if(arr [0] [0] == arr [1] [0] && arr [1] [0] == arr [2] [0]){won = true;}
        else if(arr [0] [1] == arr [1] [1] && arr [1] [1] == arr [2] [1]){won = true;}
        else if(arr [0] [2] == arr [1] [2] && arr [1] [2] == arr [2] [2]){won = true;}
        else if(arr [0] [0] == arr [1] [1] && arr [1] [1] == arr [2] [2]){won = true;}
        else if(arr [0] [2] == arr [1] [1] && arr [1] [1] == arr [2] [0]){won = true;}
        return won;
    }
}
