import java.io.FileNotFoundException;
/** 
* VehiclesPart2_Driver class.
* Project 5.
* @author Li-Kai Lin – cpsc1223 - Module 5
* @version 11_15_2018
*/
public class VehiclesPart2 {

    /**
    * main method of VehiclesPart2.
    * @param args - is not used.
    * @throws FileNotFoundException required by Scanner for File
    */
   public static void main(String[] args) throws FileNotFoundException {
      UseTaxList list1 = new UseTaxList();
      list1.readVehicleFile("vehicles1.txt");
      System.out.println(list1.summary() + "\n");
      System.out.println(list1.listByOwner() + "\n");
      System.out.println(list1.listByUseTax() + "\n");
      System.out.println(list1.excludedRecordsList() + "\n");
      
      
   }
}