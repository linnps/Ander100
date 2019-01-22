import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Car Testfile.
*
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/
public class CarTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** A test that test getOwner() methods in Vehicle. **/
   @Test public void getOwnerTest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);  
      Assert.assertTrue(" ", car1.getOwner().contains("Jones, Sam"));        
   }      


   /** A test that test getYearMakeModel() methods in Vehicle. **/
   @Test public void getYearMakeModelTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);   
      Assert.assertTrue(" ", car1.
         getYearMakeModel().contains("2017 Honda Accord"));        
   }
   
   /** A test that test getValue() methods in Vehicle. **/
   @Test public void getValueTest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Assert.assertEquals(" ", 22000, car1.getValue(), .000001);        
   }      
   
   /** A test that test getAlternativeFuel() methods in Vehicle. **/
   @Test public void getAlternativeFuelTest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);   
      Assert.assertFalse(" ", car1.getAlternativeFuel());       
   }
   
   /** A test that test resetVehicleCount() 
   *  and getVehicleCount() methods in Vehicle. 
   **/
   @Test public void getVehicleCountTest() {
      Vehicle.resetVehicleCount();
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);  
      Assert.assertEquals(" ", 1, car1.getVehicleCount());       
   }
   
   /** A test that test useTax() in Car. **/
   @Test public void useTaxTest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true); 
      Assert.assertEquals(" ", 220, car1.useTax(), .000001);
      Assert.assertEquals(" ", 110, car2.useTax(), .000001);       
   }      
   
   /** A test that test toString() methods in Car. **/
   @Test public void toStringTest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
         110000, false);
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
         110000, true);      
      Assert.assertTrue(" ", car1.toString().
         contains("with Tax Rate: 0.01"));
      Assert.assertTrue(" ", car2.toString().
         contains("with Tax Rate: 0.005"));
      Assert.assertTrue(" ", car3.toString().
         contains("Luxury Tax Rate: 0.02"));
      Assert.assertTrue(" ", car4.toString().
         contains("Luxury Tax Rate: 0.02"));                          
   }
   
   /** A test that test equals() method. **/
   @Test public void equalsTest() {
      String label = "";
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Car car3 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Assert.assertFalse(" ", car1.equals(label));
      Assert.assertFalse(" ", truck1.equals(car1));
      Assert.assertFalse(" ", car1.equals(car2));
      Assert.assertTrue(" ", car1.equals(car3));
   }      
   
   /** A test that test hashCode() method. **/
   @Test public void hashCodeTest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Assert.assertEquals(" ", 0, car1.hashCode());
   }  
}
