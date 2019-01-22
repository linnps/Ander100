import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* UseTaxComparator Testfile.
*
* Project 5.
* @author Li-Kai Lin – cpsc1223 - Module 5
* @version 11_06_2018
*/    

public class UseTaxComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that tests compare method. **/
   @Test public void compareTest() {
      Truck truck1 = new Truck("Williams, Sam", "2010 Chevy Mack",
         40000, true, 2.5); 
      Car car1 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true); 
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      UseTaxComparator c1 = new UseTaxComparator();
      
      Assert.assertEquals("", -1, c1.compare(car1, truck1));
      Assert.assertEquals("", 0, c1.compare(car1, car2));
      Assert.assertEquals("", 1, c1.compare(truck1, car1));
   }
}
