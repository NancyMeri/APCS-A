//Hi it's Nancy
import java.util.*;
public class LabPart3
{
    public static void main (String [] args){
        System.out.println("Let's sing 'The Twelve Days of Christmas'");
        Scanner scan = new Scanner(System.in);
        System.out.println("What verse shall we sing?");
        int verse = scan.nextInt(); //now I have the verse
        
        switch (verse){ //this one is for the first line
            case 12: System.out.print("On the twelfth day of Christmas, "); 
            break;
            case 11: System.out.print("On the eleventh day of Christmas, ");
            break;
            case 10: System.out.print("On the tenth day of Christmas, ");
            break;
            case 9: System.out.print("On the ninth day of Christmas, ");
            break;
            case 8: System.out.print("On the eighth day of Christmas, ");
            break;
            case 7: System.out.print("On the seventh day of Christmas, ");
            break;
            case 6: System.out.print("On the sixth day of Christmas, ");
            break;
            case 5: System.out.print("On the fifth day of Christmas, ");
            break;
            case 4: System.out.print("On the fourth day of Christmas, ");
            break;
            case 3: System.out.print("On the third day of Christmas, ");
            break;
            case 2: System.out.print("On the second day of Christmas, ");
            break;
            case 1: System.out.print("On the first day of Christmas, ");
            break;
        }
        System.out.println(" my true love gave to me ");
        switch (verse){
            case 12: System.out.println("twelve Lords a leaping, ");
            case 11: System.out.println("eleven ladies dancing, ");
            case 10: System.out.println("ten pipers piping, ");
            case 9: System.out.println("nine drummers drumming, ");
            case 8: System.out.println("eight maids a milking, ");
            case 7: System.out.println("seven swans a swimming, ");
            case 6: System.out.println("six geese a laying, ");
            case 5: System.out.println("five golden rings, ");
            case 4: System.out.println("four calling birds, ");
            case 3: System.out.println("three French hens, ");
            case 2: System.out.println("two turtle doves, and ");
            case 1: System.out.println("a partridge in a pear tree");
            break;
        }
        System.out.println("The end! Thanks for celebrating Christmas in October!");
    }
}
