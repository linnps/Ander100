import java.text.DecimalFormat;
/**
* Vehicle.
*
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/
public abstract class Vehicle implements Comparable<Vehicle> {
   //instance variables
   protected String owner;
   protected String yearMakeModel;
   protected double value;
   protected boolean alternativeFuel;
   protected static int vehicleCount = 0;

   //constructor
   /**
   *  constructor for Vehicle.
   *  @param ownerIn Command line arguments.
   *  @param yearMakeModelIn Command line arguments.
   *  @param valueIn Command line arguments.
   *  @param alternativeFuelIn Command line arguments.
   */
   public Vehicle(String ownerIn, String yearMakeModelIn,
       double valueIn, boolean alternativeFuelIn) {
      setOwner(ownerIn);
      setYearMakeModel(yearMakeModelIn);
      setValue(valueIn);
      setAlternativeFuel(alternativeFuelIn);
      vehicleCount++;
   }
   
   //methods
   /**  
    *  @return owner
    */
   public String getOwner() {
      return owner;
   }
   
   /**  
    *  @param ownerIn to set the owner.
    */
   public void setOwner(String ownerIn) {
      owner = ownerIn;
   }
   
   /**  
    *  @return yearMakeModel
    */
   public String getYearMakeModel() {
      return yearMakeModel;
   }
   
   /**  
    *  @param yearMakeModelIn to set the yearMakeModel.
    */
   public void setYearMakeModel(String yearMakeModelIn) {
      yearMakeModel = yearMakeModelIn;
   }      
   
   /**  
    *  @return value
    */
   public double getValue() {
      return value;
   }
   
   /**  
    *  @param valueIn to set the value.
    */
   public void setValue(double valueIn) {
      value = valueIn;
   }               
   
   /**  
    *  @return alternativeFuel
    */
   public boolean getAlternativeFuel() {
      return alternativeFuel;
   }
   
   /**  
    *  @param alternativeFuelIn to set the alternativeFuel.
    */
   public void setAlternativeFuel(boolean alternativeFuelIn) {
      alternativeFuel = alternativeFuelIn;
   }
    
   /**  
    *  @return vehicleCount
    */
   public static int getVehicleCount() {
      return vehicleCount;
   }
   
   /**  
    *  reset the vehicleCount.
    */
   public static void resetVehicleCount() {
      vehicleCount = 0;
   }
   
   /**  
    *  no body in Vehicle; it will be overridden in its subclasses.
    *  @return double
    */      
   public abstract double useTax();
   
    /**  
    *  @return String representing Vehicle class.
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String output = "";
      if (this.getAlternativeFuel()) {
         output = this.getOwner() + ": " + getClass().getName() 
            + " " + this.getYearMakeModel() + " (Alternative Fuel)" 
            + "\nValue: " + df.format(this.getValue()) 
            + " Use Tax: " + df.format(this.useTax());
      }
      else {
         output = this.getOwner() + ": " + getClass().getName() 
            + " " +  this.getYearMakeModel() 
            + "\nValue: " + df.format(this.getValue()) 
            + " Use Tax: " + df.format(this.useTax());         
      }
      return output;
   }
   
   /**
   * @param obj the other object.
   * @return boolean
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Vehicle)) {
         return false;
      }
      else {
         Vehicle other = (Vehicle) obj;
         return (owner + yearMakeModel + value).
            equals(other.owner + other.yearMakeModel
                   + other.value);
      }
   }
   
   /** @return 0 */
   public int hashCode() {
      return 0;
   }
   
   /**
   * @param other the other object.
   * @return int
   */      
   public int compareTo(Vehicle other) {
      return owner.toLowerCase()  
                 .compareTo(other.getOwner().toLowerCase());
   }      
    
   
}