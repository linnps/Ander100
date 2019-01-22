/**
* Truck.
*
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/
public class SemiTractorTrailer extends Truck {
   //instance variables
   protected int axles;
   /** these are constants.*/
   public static final double PER_AXLE_TAX_RATE = 0.005;

   //constructor
   /**
   *  constructor for Truck.
   *  @param ownerIn Command line arguments.
   *  @param yearMakeModelIn Command line arguments.
   *  @param valueIn Command line arguments.
   *  @param alternativeFuelIn Command line arguments.
   *  @param tonsIn Command line arguments.
   *  @param axlesIn Command line arguments.
   */
   public SemiTractorTrailer(String ownerIn, String yearMakeModelIn,
       double valueIn, boolean alternativeFuelIn, double tonsIn, int axlesIn) {
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn, tonsIn);
      setAxles(axlesIn);
   }      
   //methods
   
   /**  
    *  @return axles
    */
   public int getAxles() {
      return axles;
   }
   
   /**  
    *  @param axlesIn to set the axles.
    */
   public void setAxles(int axlesIn) {
      axles = axlesIn;
   }
          
   
   /**  
    *  @return double representing the total use tax.
    */
   public double useTax() {
      double price = super.useTax() 
         + getValue() * PER_AXLE_TAX_RATE * axles;
      return price;
   }
        
    /**  
    *  @return String representing Vehicle class.
    */
   public String toString() {
      String output = super.toString();
      
      output += " Axle Tax Rate: " + PER_AXLE_TAX_RATE * axles;       
      
      return output;
   }
           
}