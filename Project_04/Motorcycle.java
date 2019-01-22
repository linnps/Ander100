/**
* Motorcycle.
*
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/
public class Motorcycle extends Vehicle {
   //instance variables
   protected double engineSize;
   /** these are constants.*/
   public static final double TAX_RATE = 0.005,
       ALTERNATIVE_FUEL_TAX_RATE = 0.0025, 
       LARGE_BIKE_CC_THRESHOLD = 499, 
       LARGE_BIKE_TAX_RATE = 0.015;

   //constructor
   /**
   *  constructor for Motorcycle.
   *  @param ownerIn Command line arguments.
   *  @param yearMakeModelIn Command line arguments.
   *  @param valueIn Command line arguments.
   *  @param alternativeFuelIn Command line arguments.
   *  @param engineSizeIn Command line arguments.
   */
   public Motorcycle(String ownerIn, String yearMakeModelIn,
       double valueIn, boolean alternativeFuelIn, double engineSizeIn) {
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
      setEngineSize(engineSizeIn);
   }      
   //methods
   
   /**  
    *  @return engineSize representing the engine size.
    */
   public double getEngineSize() {
      return engineSize;
   }
   
   /**  
    *  @param engineSizeIn to set the engineSize.
    */
   public void setEngineSize(double engineSizeIn) {
      engineSize = engineSizeIn;
   }
   
   
   
   /**  
    *  @return double representing the total use tax.
    */
   public double useTax() {
      double price = 0;
      if (getAlternativeFuel()) {
         price = getValue() * ALTERNATIVE_FUEL_TAX_RATE;
      
      } else {
         price = getValue() * TAX_RATE;
      }
      
      if (getEngineSize() > LARGE_BIKE_CC_THRESHOLD) {
         price += getValue() * LARGE_BIKE_TAX_RATE;
      }
      return price;
   }
        
    /**  
    *  @return String representing Vehicle class.
    */
   public String toString() {
      String output = super.toString();
      if (getAlternativeFuel()) {
         output += "\nwith Tax Rate: " + ALTERNATIVE_FUEL_TAX_RATE; 
      } else {
         output += "\nwith Tax Rate: " + TAX_RATE;
      }
      
      if (getEngineSize() > LARGE_BIKE_CC_THRESHOLD) {
         output += " Large Bike Tax Rate: " + LARGE_BIKE_TAX_RATE;
      }        
      
      return output;
   }        
}