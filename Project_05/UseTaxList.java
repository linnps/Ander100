import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.text.DecimalFormat;
/**
* UseTaxList.
*
* Project 5.
* @author Li-Kai Lin – cpsc1223 - Module 5
* @version 11_15_2018
*/
public class UseTaxList {
   //instance variables
   private String taxDistrict;
   private Vehicle[] vehicleList;
   private String[] excludedRecords;

   //constructor
   /**
   *  constructor for UseTaxList.
   */
   public UseTaxList() {
      taxDistrict = "not yet assigned";
      vehicleList = new Vehicle[0];
      excludedRecords = new String[0];
   }
   
   /**  
    *  @param fileName to read in files.
    *  @throws FileNotFoundException required by Scanner for File
    */      
   public void readVehicleFile(String fileName) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      //Scan that the first line in the file 
      //contains the taxDistrict.
      taxDistrict = scanFile.nextLine().trim();
      //scan data from files
      while (scanFile.hasNext()) {
      
         String vehicle = scanFile.nextLine().trim();
         Scanner scanFile2 = new Scanner(vehicle).useDelimiter(";");
      
         char vehicleType = scanFile2.next().toUpperCase().trim().charAt(0);
         String owner = scanFile2.next().trim();
         String yearMakeModel = scanFile2.next().trim();
         double value = Double.parseDouble(scanFile2.next().trim());
         boolean alternativeFuel = scanFile2.next().trim().equals("true");
        
         switch (vehicleType) {
            case 'C':
               Car c = new Car(owner, yearMakeModel, 
                                 value, alternativeFuel);
               addVehicle(c);
               break;
            case 'T':
               double tonsIn 
                  = Double.parseDouble(scanFile2.next().trim());
               Truck t = new Truck(owner, yearMakeModel, 
                                 value, alternativeFuel, tonsIn);
               addVehicle(t);
               break;
            case 'S':
               tonsIn 
                  = Double.parseDouble(scanFile2.next().trim());
               int axlesIn 
                  = Integer.parseInt(scanFile2.next().trim());
               SemiTractorTrailer s 
                  = new SemiTractorTrailer(owner, 
                     yearMakeModel, value, alternativeFuel, 
                     tonsIn, axlesIn);                  
               addVehicle(s);
               break;
            case 'M':
               double engineSizeIn 
                  = Double.parseDouble(scanFile2.next().trim());
               Motorcycle m 
                  = new Motorcycle(owner, yearMakeModel, 
                                 value, alternativeFuel, engineSizeIn);
               addVehicle(m);
               break;
            default:
               addExcludedRecord(vehicle);
               break;   
         }         
      }
      scanFile.close();
   }
   /**  
    *  @return taxDistrict
    */
   public String getTaxDistrict() {
      return taxDistrict;
   }
   
   /**  
    *  @param taxDistrictIn to set the taxDistrict.
    */
   public void setTaxDistrict(String taxDistrictIn) {
      taxDistrict = taxDistrictIn;
   }
   /**  
    *  @return excludedRecords
    */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }      
      
   /**  
    *  @return vehicleList
    */
   public Vehicle[] getVehicleList() {
      return vehicleList;
   }
     
         
   /**  
    *  @param vehicleIn for vehicle input.
    */
   public void addVehicle(Vehicle vehicleIn) {
      vehicleList = Arrays.copyOf(vehicleList, vehicleList.length + 1);
      vehicleList[vehicleList.length - 1] = vehicleIn;
   }
   
   /**  
    *  @param vehicleIn for vehicle input.
    */
   public void addExcludedRecord(String vehicleIn) {
      excludedRecords 
         = Arrays.copyOf(excludedRecords, excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = vehicleIn;
   }
                        
    /**  
    *  @return String representing Vehicle class.
    */
   public String toString() {
      String output = "";
      for (Vehicle v : vehicleList) {
         output += "\n" + v + "\n";
      }
      return output;
   }
    /**  
    *  @return double representing total tax.
    */
   public double calculateTotalUseTax() {
      double totalTax = 0;
      for (Vehicle v : vehicleList) {
         totalTax += v.useTax();
      }
      return totalTax;
   }      
   
    /**  
    *  @return double representing total tax.
    */
   public double calculateTotalValue() {
      double totalValue = 0;
      for (Vehicle v : vehicleList) {
         totalValue += v.getValue();
      }
      return totalValue;
   }
   
    /**  
    *  @return String representing Vehicle class.
    */
   public String summary() {
      DecimalFormat df = new DecimalFormat("#,##0.00");
      String output = "";
      output += "------------------------------\n";
      output += "Summary for " + taxDistrict + "\n";
      output += "------------------------------\n";
      output += "Number of Vehicles: " 
            + vehicleList.length + "\n";
      output += "Total Value: $" 
            + df.format(calculateTotalValue()) + "\n";
      output += "Total Use Tax: $" 
            + df.format(calculateTotalUseTax()) + "\n";
      return output;
   }   
    /**  
    *  @return String representing Vehicles ordered by owner.
    */
   public String listByOwner() {
      Arrays.sort(vehicleList);
      String output = "";
      output += "------------------------------\n";
      output += "Vehicles by Owner\n";
      output += "------------------------------\n";
      for (Vehicle v : vehicleList) {
         output += "\n" + v + "\n";
      }
      return output;
   }
    /**  
    *  @return String representing Vehicles ordered by use tax.
    */
   public String listByUseTax() {
      Arrays.sort(vehicleList, new UseTaxComparator());
      String output = "";
      output += "------------------------------\n";
      output += "Vehicles by Use Tax\n";
      output += "------------------------------\n";
      for (Vehicle v : vehicleList) {
         output += "\n" + v + "\n";
      }
      return output;
   }
    /**  
    *  @return String representing excludedRecordsList.
    */
   public String excludedRecordsList() {
      String output = "";
      output += "------------------------------\n";
      output += "Excluded Records\n";
      output += "------------------------------\n";
      for (String v : excludedRecords) {
         output += "\n" + v + "\n";
      }
      return output;
   }                         
         
   
}