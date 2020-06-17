public class TacoLabTester{
    public static void main (String [] args){
        TacoLab taco1 = new TacoLab();
        taco1.setFilling("rice");
        taco1.addTopping("guacamole");
        taco1.setShell("hard");
        taco1.TacoTuesday(true);
        System.out.println(taco1.getFilling() + " is/are the fillings");
        System.out.println(taco1.getToppings() + " is/are the toppings");
        System.out.println(taco1.getShell() + " is the shell type");
        System.out.println(taco1.getPrice()+ " is the price in dolars");
    }
}