//Nancy

/* Write a program that will allow the user to enter in a series of grade 
 * percentages and then calculate an average grade percentage (e.g. 91%) 
 * and grade letter (e.g. A). Allow the user to enter in grades until they 
 * decide to stop.
 */
import java.util.*;
public class GradeCalculator
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        double total = 0;
        int num = -1; //this will counter the last input of -1
        double i = 1.0;
        while (i != -1.0){
            System.out.println("Enter a grade, or enter -1 if you are done.");
            i = scan.nextDouble();
            total += i;
            num ++;
        }
        total += 1; //to counter the last -1
        double grade = total / num;
        String letter;
        if (grade >= 90.0) {letter = "A";}
        else if (grade >= 80.0) {letter = "B";}
        else if (grade >= 70.0) {letter = "C";}
        else if (grade >= 65.0) {letter = "D";}
        else {letter = "F";}
        System.out.println();
        System.out.print("this student has a " + grade + "%, ");
        System.out.println("which is also the letter grade " + letter);
    }
}
