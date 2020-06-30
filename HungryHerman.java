//Nancy
import java.util.*;
public class HungryHerman
{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        ArrayList<String> plate = new ArrayList<String>(4);
        System.out.println("First food?");
        String food1 = scan.nextLine();
        System.out.println("Second food?");
        String food2 = scan.nextLine();
        System.out.println("Third food?");
        String food3 = scan.nextLine();
        System.out.println("Fourth food?");
        String food4 = scan.nextLine();
        plate.add(0, food1);
        plate.add(1, food2);
        plate.add(2, food3);
        plate.add(3, food4);
        System.out.println(plate);
        plate.remove(2);
        System.out.println(plate);
        plate.add(3, "ice cream");
        System.out.println(plate);
        if (plate.contains("green beans"))
            System.out.println("Yes, he has green beans.");
        else{System.out.println("No...");}
        plate.add(0, "salad");
        System.out.println(plate.indexOf("salad"));
        System.out.println(plate);
        for (int i = 0; i < plate.size(); i = i){
            plate.remove(i);
            System.out.println(plate);
        }
    }
}
