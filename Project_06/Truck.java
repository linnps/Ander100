/**
* Truck.
*
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/
public class Truck extends Vehicle {
   //instance variables
   protected double tons;
   /** these are constants.*/
   public static final double TAX_RATE = 0.02,
       ALTERNATIVE_FUEL_TAX_RATE = 0.01, 
       LARGE_TRUCK_TONS_THRESHOLD = 2.0, 
       LARGE_TRUCK_TAX_RATE = 0.03;

   //constructor
   /**
   *  constructor for Truck.
   *  @param ownerIn Command line arguments.
   *  @param yearMakeModelIn Command line arguments.
   *  @param valueIn Command line arguments.
   *  @param alternativeFuelIn Command line arguments.
   *  @param tonsIn Command line arguments.
   */
   public Truck(String ownerIn, String yearMakeModelIn,
       double valueIn, boolean alternativeFuelIn, double tonsIn) 
         throws NegativeValueException {
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
      setTons(tonsIn);
   }      
   //methods
   
   /**  
    *  @return tons
    */
   public double getTons() {
      return tons;
   }
   
   /**  
    *  @param tonsIn to set the owner.
    */
   public void setTons(double tonsIn) {
      tons = tonsIn;
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
      
      if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
         price += getValue() * LARGE_TRUCK_TAX_RATE;
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
      
      if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
         output += " Large Truck Tax Rate: " + LARGE_TRUCK_TAX_RATE;
      }        
      
      return output;
   }        
}