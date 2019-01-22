import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Truck Testfile.
*
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/   

public class TruckTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that test getTons() methods in Truck. **/
   @Test public void getTonsTest() {
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);  
      Assert.assertEquals(" ", 1.5, truck1.getTons(), .000001);        
   }
   
   /** A test that test useTax() in Truck. **/
   @Test public void useTaxTest() {
      
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack",
         40000, true, 2.5); 
      Assert.assertEquals(" ", 600, truck1.useTax(), .000001);
      Assert.assertEquals(" ", 1600, truck2.useTax(), .000001);       
   }
   /** A test that test toString() methods in Truck. **/
   @Test public void toStringTest() {
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack",
         40000, true, 2.5);         
      Assert.assertTrue(" ", truck1.toString().
         contains("with Tax Rate: 0.02"));
      Assert.assertTrue(" ", truck2.toString().
         contains("Large Truck Tax Rate: 0.03"));                 
   }           
}
