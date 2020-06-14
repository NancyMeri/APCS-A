
import java.util.*;
public class MathFunctions{
    public static void main (String [] args){
        // this is part a
        /* Write code that determines and prints the distance between two 
         * points given the x and y coordinates of each point.*/
        Scanner scan = new Scanner (System.in); //creates scanner scan
        System.out.println ("Please enter first point's x value");
        double xFirst = scan.nextDouble(); //
        scan.nextLine();
        System.out.println ("Please enter first point's y value");
        double yFirst = scan.nextDouble();
        scan.nextLine();
        System.out.println ("Please enter second point's x value");
        double xSecond= scan.nextDouble();
        scan.nextLine();
        System.out.println ("Please enter second point's y value");
        double ySecond = scan.nextDouble();
        scan.nextLine();
        double inRoot = Math.pow((xFirst - xSecond), 2) + Math.pow((yFirst - ySecond), 2);
        double ansA = Math.sqrt(inRoot); //two lines are distance formula
        System.out.println("The distance between these two points is " + ansA);
        
        //this is part b
        /* Write code that determines and prints the area of a 
         * triangle given the 3 side lengths */
        System.out.println ("Please enter 1 side length");
        double side1 = scan.nextDouble();
        scan.nextLine();
        System.out.println ("Please enter another side length");
        double side2 = scan.nextDouble();
        scan.nextLine();
        System.out.println ("Please enter the third side length");
        double side3 = scan.nextDouble();
        scan.nextLine();
        //series of if statements to see if it's a triangle
        if (side1>=(side2+side3)) {
            System.out.println ("Those measurements do not make a triangle");
        }
        else if (side2>=(side1+side3)) {
            System.out.println ("Those measurements do not make a triangle");
        }
        else if (side3>=(side2+side1)) {
            System.out.println ("Those measurements do not make a triangle");
        }
        else {
            double s = (side1 + side2 + side3)/2;
            double ansB = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)); //Heron
            System.out.println(ansB + " is the area of the triangle");
        }
        //this is part c
        /*Write code that takes three integers that represent a, b, and 
         * c in the standard form of a quadratic equation and print the 
         number and types of solutions that should be expected.*/
        System.out.println("Please enter the coefficient of x squared");
        double a = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter the coefficient of x");
        double b = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter the constant");
        double c = scan.nextDouble();
        scan.nextLine();
        double ansC = (b*b)- (4*a*c); //finds discriminant
        if (ansC == 0) {
            System.out.println("You have one real, repeating solution");
        }
        else if (ansC > 0) {
            System.out.println("You have two distinct real solutions");
        }
        else {
            System.out.println("You have no real solutions");
        }
        
        //this is part d
        /*Write code that determines the solutions of a quadratic equation 
         * given a, b, and c in the standard form of a quadratic equation
         * and prints the two solutions in a formatted String. (Warning: 
         * Consider what happens when the discriminant is negative. Include
         * some conditions to prevent NaN.)
         */
        System.out.println("Please enter the coefficient of x squared");
        double dA = scan.nextDouble(); //dA for part d's a (not part c's)
        scan.nextLine();
        System.out.println("Please enter the coefficient of x");
        double dB = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter the constant");
        double dC = scan.nextDouble();
        scan.nextLine();
        double discriminant = ((b*b)- (4*a*c));
        if (discriminant < 0) { //this prevents NaN
            double positiveDiscriminant = discriminant * -1; //makes positive
            double ansImaginary1 = (-dB + positiveDiscriminant) / (2*dA);
            double ansImaginary2 = (-dB - positiveDiscriminant) / (2*dA);
            if (ansImaginary1 == ansImaginary2){ //tests for one solution
                System.out.println("You have one imaginary solution: " + ansImaginary1 + "i");
            } //line above prints with 'i'
            else {
                System.out.println("You have two imaginary solutions: " + ansImaginary1 + "i and " + ansImaginary2 + "i");
            }
        }
        else {
            double ansD1 = (-dB + discriminant) / (2*dA);
            double ansD2 = (-dB - discriminant) / (2*dA);
            if (ansD1 == ansD2){
                System.out.println("You have one solutions: " + ansD1);
            } //tests for one solution and prints it
            else {
                System.out.println("You have two solutions: " + ansD1 + " and " + ansD2);
            } //line above prints the two solutions
       }
       //this is part d
       /* Write code that takes a number of days and determines how many 
        * weeks and days it is. It should print the number of weeks and 
          days in a formatted String.*/
       System.out.println("how many days?");
       int justDays = scan.nextInt();
       int weeks = justDays/7; //int of full weeks
       int days = justDays%7; //int of remaining days
       System.out.println("That's " + weeks + " weeks and " + days + " days.");
    }
}