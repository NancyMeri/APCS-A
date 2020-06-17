
public class TacoLab {
    private String filling;
    private String topping;
    private String shell;
    private double price;
    private boolean tuesday;
    
    public TacoLab(){
        filling = "cheese";
        topping = "salsa";
        shell = "soft";
        price = 10.00;
        tuesday = false;
    }
    
    public TacoLab(String strFilling, String strTopping, String strShell, 
    boolean fctTuesday){
        filling = strFilling;
        topping = strTopping;
        shell = strShell;
        price = 10.00;
        tuesday = fctTuesday;
    }
    
    public void setFilling(String strFilling){
        filling = strFilling;
    }
    
    public void addTopping(String strTopping){
        topping = topping + " and " + strTopping;
        price = price + 0.50;
    }
    
    public void setShell(String strShell){
        shell = strShell;
    }
    
    public void TacoTuesday(boolean fctTuesday){
        if (fctTuesday) { price = price - (price * 0.1); }
    }
    
    public String getFilling (){
        return filling;
    }
    
    public String getToppings (){
        return topping;
    }
    
    public String getShell (){
        return shell;
    }
    
    public double getPrice (){
        return price;
    }
}
