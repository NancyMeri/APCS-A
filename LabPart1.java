//Hi it's Nancy
import java.util.*;
public class LabPart1
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your current weight in pounds on Earth?");
        double earthWeight = scan.nextDouble();
        System.out.println("What number planet are you fighting on next");
        int planet = scan.nextInt();
        double planetWeight = 0;
        if (planet == 1) {
            planetWeight = 0.78 * earthWeight;
        }
        else if (planet == 2) {
            planetWeight = 0.39 * earthWeight;
        }
        else if (planet == 3) {
            planetWeight = 2.65 * earthWeight;
        }
        else if (planet == 4) {
            planetWeight = 1.17 * earthWeight;
        }
        else if (planet == 5) {
            planetWeight = 1.05 * earthWeight;
        }
        else if (planet == 6) {
            planetWeight = 1.23 * earthWeight;
        }
        
        System.out.println("You weigh " + planetWeight + " lbs on that planet");
    }
}