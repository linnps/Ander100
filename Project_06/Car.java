/**
* Car.
*
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/
public class Car extends Vehicle {
   //instance variables
   /** these are constants.*/
   public static final double TAX_RATE = 0.01,
       ALTERNATIVE_FUEL_TAX_RATE = 0.005, 
       LUXURY_THRESHOLD = 50_000, 
       LUXURY_TAX_RATE = 0.02;

   //constructor
   /**
   *  constructor for Car.
   *  @param ownerIn Command line arguments.
   *  @param yearMakeModelIn Command line arguments.
   *  @param valueIn Command line arguments.
   *  @param alternativeFuelIn Command line arguments.
   */
   public Car(String ownerIn, String yearMakeModelIn,
       double valueIn, boolean alternativeFuelIn) {
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
   }      
   //methods
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
      
      if (getValue() > LUXURY_THRESHOLD) {
         price += getValue() * LUXURY_TAX_RATE;
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
      
      if (getValue() > LUXURY_THRESHOLD) {
         output += " Luxury Tax Rate: " + LUXURY_TAX_RATE;
      }        
      
      return output;
   }        
}