//Hi this is Nancy

import java.util.*;
public class CarLabTester{
    public static void main (String [] args){
        
        //fist I'll assign everything using the actual parameters
        //type (aka classname) variableName = new type (parameters);
        //now use scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("What year?");
        int yearNum = scan.nextInt();
        System.out.println("How many miles");
        int milesNum = scan.nextInt();
        System.out.println("What manufacturer?");
        scan.nextLine();
        String manufacturerStr = scan.nextLine();
        System.out.println("What model?");
        String modelStr = scan.nextLine();
        
        CarLab car = new CarLab (yearNum, milesNum, manufacturerStr, 
        modelStr);
        
        //dot operator is a .
        //objectName.whateverMethodYouAreCalling (parameters)
        System.out.println ("Year Manufactured: " + car.getYearManufactured());
        
        System.out.println ("Miles Driven: " + car.getMilesDriven());
        
        System.out.println ("Kilometers Driven: " + car.getKilometersDriven());
        
        System.out.println ("Manufacturer Name: " + car.getManufacturerName());
        
        System.out.println ("Model Name: " + car.getModelName());
        
        System.out.println ("How many miles?");
        
        //now I'll assign using setter methods
        //setter method test
        int a = scan.nextInt();
        car.setMilesDriven(a);
        
        System.out.println ("What year?");
        int b = scan.nextInt();
        car.setYearManufactured(b);
        
        System.out.println ("What manufacturer?");
        scan.nextLine();
        String c = scan.nextLine();
        car.setManufacturerName(c);
        
        System.out.println ("What model?");
        String d = scan.nextLine();
        car.setModelName(d);
        
        System.out.println ("Miles Driven: " + car.getMilesDriven());
        System.out.println ("Year Manufactured: " + car.getYearManufactured());
        System.out.println ("Manufacturer Name: " + car.getManufacturerName());
        System.out.println ("Manufacturer Name: " + car.getModelName());
    }
}