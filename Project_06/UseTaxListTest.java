import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
* UseTaxListTest Testfile.
*
* Project 5.
* @author Li-Kai Lin – cpsc1223 - Module 5
* @version 11_15_2018
*/   

public class UseTaxListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** 
   * A test that test getTaxDistrict() methods in UseTaxList. 
   * @throws FileNotFoundException to deal with exception.
   **/      
   @Test public void getTaxDistrictTest() throws FileNotFoundException {
      UseTaxList list1 = new UseTaxList();
      list1.readVehicleFile("vehicles1.txt");
      Assert.assertTrue(" ", 
         list1.getTaxDistrict().contains("Tax District 52"));
   }      

   /** 
   * A test that test setTaxDistrict() methods in UseTaxList. 
   * @throws FileNotFoundException to deal with exception.
   **/      
   @Test public void setTaxDistrictTest() throws FileNotFoundException {
      UseTaxList list1 = new UseTaxList();
      list1.readVehicleFile("vehicles1.txt");
      list1.setTaxDistrict("Tax District 53");
      Assert.assertTrue(" ", 
         list1.getTaxDistrict().contains("Tax District 53"));
   }
   
   /**
   * A test that test add and getExcludedRecords()
   * methods in UseTaxList. 
   **/
   @Test public void getExcludedRecordsTest() {
      UseTaxList list1 = new UseTaxList();
      String car1 
         = "Jones, Sam; 2017 Honda Accord; 22000; false";
      String car2 
         = "Jones, Jo; 2017 Honda Accord; 22000; true";
      String car3 
         = "Smith, Pat; 2015 Mercedes-Benz Coupe; 110000; false";
      String[] list2 = {car1, car2, car3};
      list1.addExcludedRecord(car1);
      list1.addExcludedRecord(car2);
      list1.addExcludedRecord(car3);
      Assert.assertArrayEquals(" ", list2, list1.getExcludedRecords());
   }
   /**
   * A test that test addVehicle() and getVehicleList()
   * methods in UseTaxList. 
   **/
   @Test public void getVehicleListTest() {
      UseTaxList list1 = new UseTaxList();
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true); 
      Car[] list2 = {car1, car2};
      list1.addVehicle(car1);
      list1.addVehicle(car2);
      Assert.assertArrayEquals(" ", list2, list1.getVehicleList());
   }
   
   /** 
   * A test that test toString() methods in UseTaxList. 
   * @throws FileNotFoundException to deal with exception.
   **/      
   @Test public void toStringtest2() throws FileNotFoundException {
      UseTaxList list1 = new UseTaxList();
      list1.readVehicleFile("vehicles1.txt");
      Assert.assertTrue(" ", 
         list1.toString().contains("Jones, Sam:"));
   }
   /////////////
   /** 
   * A test that test calculateTotalUseTax() methods 
   * in UseTaxList. 
   * @throws FileNotFoundException to deal with exception.
   **/      
   @Test public void calculateTotalUseTaxtest() 
      throws FileNotFoundException {
      UseTaxList list1 = new UseTaxList();
      list1.readVehicleFile("vehicles1.txt");
      Assert.assertEquals(" ", 12010, 
         list1.calculateTotalUseTax(), .0001);
   }
   /** 
   * A test that test calculateTotalValue() methods in UseTaxList. 
   * @throws FileNotFoundException to deal with exception.
   **/      
   @Test public void calculateTotalValuetest() throws FileNotFoundException {
      UseTaxList list1 = new UseTaxList();
      list1.readVehicleFile("vehicles1.txt");
      Assert.assertEquals(" ", 393000, 
         list1.calculateTotalValue(), .0001);
   }          
   
   
   
   ///////////
   /** 
   * A test that test summary() methods in UseTaxList. 
   * @throws FileNotFoundException to deal with exception.
   **/      
   @Test public void summarytest() throws FileNotFoundException {
      UseTaxList list1 = new UseTaxList();
      list1.readVehicleFile("vehicles1.txt");
      Assert.assertTrue(" ", 
         list1.summary().contains("393,000.00"));
   }
   /** 
   * A test that test listByOwner() methods in UseTaxList. 
   * @throws FileNotFoundException to deal with exception.
   **/      
   @Test public void listByOwnertest() throws FileNotFoundException {
      UseTaxList list1 = new UseTaxList();
      list1.readVehicleFile("vehicles1.txt");
      Assert.assertTrue(" ", 
         list1.listByOwner().contains("Jones, Jo: Car 2017"));
   }
   
   /** 
   * A test that test listByUseTax() methods in UseTaxList. 
   * @throws FileNotFoundException to deal with exception.
   **/      
   @Test public void listByUseTaxtest() 
      throws FileNotFoundException {
      UseTaxList list1 = new UseTaxList();
      list1.readVehicleFile("vehicles1.txt");
      Assert.assertTrue(" ", 
         list1.listByUseTax().
            contains("Jones, Jo"));
   }       
   
   /** 
   * A test that test excludedRecordsList() methods in UseTaxList. 
   * @throws FileNotFoundException to deal with exception.
   **/      
   @Test public void excludedRecordsListtest() 
      throws FileNotFoundException {
      UseTaxList list1 = new UseTaxList();
      list1.readVehicleFile("vehicles1.txt");
      Assert.assertTrue(" ", 
         list1.excludedRecordsList().
            contains("race car; Zinc"));
   }               
             
}
