import java.util.Comparator;
/**
* UseTaxComparator.
*
* Project 5.
* @author Li-Kai Lin – cpsc1223 - Module 5
* @version 11_15_2018
*/      
public class UseTaxComparator implements Comparator<Vehicle> {
   
   /**  
    *  compare Vehicles by use tax.
    *  @param v1 for #1 Vehicle input.
    *  @param v2 for #2 Vehicle input.
    *  @return int
    */      
   public int compare(Vehicle v1, Vehicle v2) {
      if (v1.useTax() < v2.useTax()) {
         return -1;
      }
      else if (v1.useTax() > v2.useTax()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}