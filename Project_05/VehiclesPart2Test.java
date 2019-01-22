import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
* VehiclesPart2 Testfile.
*
* Project 5.
* @author Li-Kai Lin – cpsc1223 - Module 5
* @version 11_06_2018
*/   
public class VehiclesPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** 
   * A test that test VehiclesPart2. 
   * @throws FileNotFoundException to deal with exception.
   **/
   @Test public void defaultTest() throws FileNotFoundException {
      VehiclesPart2 vPart2Obj = new VehiclesPart2();
      Vehicle.resetVehicleCount();
      
      String[] args = {"vehicles1.txt"};
      VehiclesPart2.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());
   }
}
