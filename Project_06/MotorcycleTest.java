import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Motorcycle Testfile.
*
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/ 

public class MotorcycleTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that test getEngineSize() methods in Motorcycle. **/
   @Test public void getEngineSizeTest() {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster", 14000, false, 750);
      Assert.assertEquals(" ", 750, bike1.getEngineSize(), .000001);        
   }
   
   /** A test that test useTax() in Motorcycle. **/
   @Test public void useTaxTest() {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster", 14000, false, 750);
      Motorcycle bike2 = new Motorcycle("Alex, Marlon",
         "1964 Harley-Davidson Sportster", 14000, true, 400); 
      Assert.assertEquals(" ", 280, bike1.useTax(), .000001);
      Assert.assertEquals(" ", 35, bike2.useTax(), .000001);       
   }
   /** A test that test toString() methods in Motorcycle. **/
   @Test public void toStringTest() {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster", 14000, false, 750);
      Motorcycle bike2 = new Motorcycle("Alex, Marlon",
         "1964 Harley-Davidson Sportster", 14000, true, 400);         
      Assert.assertTrue(" ", bike1.toString().
         contains("Large Bike Tax Rate:"));
      Assert.assertTrue(" ", bike2.toString().
         contains("with Tax Rate: 0.0025"));                 
   }       
}
