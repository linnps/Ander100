import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* SemiTractorTrailer Testfile.
*
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/   

public class SemiTractorTrailerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** A test that test getAxles() methods in SemiTractor. **/
   @Test public void getAxlesTest() {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
      Assert.assertEquals(" ", 4, semi1.getAxles());        
   }
   
   /** A test that test useTax() in SemiTractor. **/
   @Test public void useTaxTest() {
      
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
      Assert.assertEquals(" ", 3150, semi1.useTax(), .000001);      
   }
   /** A test that test toString() methods in Truck. **/
   @Test public void toStringTest() {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);         
      Assert.assertTrue(" ", semi1.toString().
         contains("Axle Tax Rate: 0.02"));               
   }       
   
}