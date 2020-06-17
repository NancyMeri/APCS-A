// Hi this is Nancy
public class CarLab{
    // instance variables (fields):
    private int yearManufactured;
    private int milesDriven;
    private String manufacturer;
    private String model;
    
    //constructor
    public CarLab (){
        yearManufactured = 1997;
        milesDriven = 100000;
        manufacturer = "Jeep";
        model = "1997 Cherokee";
    }
    
    public CarLab (int numYearManufactured, int numMilesDriven, 
    String strManufacturer,String strModel){
        yearManufactured = numYearManufactured;
        milesDriven = numMilesDriven;
        manufacturer = strManufacturer;
        model = strModel;
    }
    
    //mutater methods
    public void setYearManufactured (int temp){
        yearManufactured = temp;
    }
    
    public void setMilesDriven (int temp){
        milesDriven = temp;
    }
    
    public void setManufacturerName (String temp){
        manufacturer = temp;
    }
    
    public void setModelName (String temp){
        model = temp;
    }
    
    //getter methods
    public int getYearManufactured (){
        return yearManufactured;
    }
    public int getMilesDriven (){
        return milesDriven;
    }
    public String getManufacturerName (){
        return manufacturer;
    }
    public String getModelName (){
        return model;
    }
    // 1 mile = 1.6094 kilometers)
    public double getKilometersDriven (){
        return (1.6094 * milesDriven);
    }
}