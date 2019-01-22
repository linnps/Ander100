import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* VehiclesPart1 Testfile.
*
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/    

public class VehiclesPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that test VehiclesPart1. **/
   @Test public void defaultTest() {
      VehiclesPart1 vp1 = new VehiclesPart1();
      Vehicle.resetVehicleCount();
      VehiclesPart1.main(null);
      Assert.assertEquals("Vehicle.vehicleCount should be 8. ",
         8, Vehicle.getVehicleCount());
   }
}
