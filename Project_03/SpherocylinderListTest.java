import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* SpherocylinderList testfile.
*
* Project 3.
* @author Li-Kai Lin – cpsc1223 - Module 3
* @version 10_30_2018
*/   
public class SpherocylinderListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that test numberOfSpherocylinders() methods. **/
   @Test public void numberOfSpherocylindersTest() {
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder sP3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sP = {sP1, sP2, sP3};
      SpherocylinderList sList 
         = new SpherocylinderList("SpherocylinderList 1", sP, 3); 
      Assert.assertEquals(" ", 3, sList.numberOfSpherocylinders());
   }
   
   
   /** A test that test totalSurfaceArea() methods. **/
   @Test public void totalSurfaceAreaTest() {
      Spherocylinder[] sPArray1 = {};
      SpherocylinderList sList1 
         = new SpherocylinderList("SpherocylinderList 1", sPArray1, 0);
      Assert.assertEquals(" ", 0, sList1.totalSurfaceArea(), 0);
    
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder sP3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sPArray2 = {sP1, sP2, sP3};
      SpherocylinderList sList2 
         = new SpherocylinderList("SpherocylinderList 2", sPArray2, 3); 
      Assert.assertEquals(" ", 184790.426414, sList2.totalSurfaceArea(), .0001);
   }
   
   /** A test that test totalVolume() methods. **/
   @Test public void totalVolumeTest() {
      Spherocylinder[] sPArray1 = {};
      SpherocylinderList sList1 
         = new SpherocylinderList("SpherocylinderList 1", sPArray1, 0);
      Assert.assertEquals(" ", 0, sList1.totalVolume(), 0);
    
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder sP3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sPArray2 = {sP1, sP2, sP3};
      SpherocylinderList sList2 
         = new SpherocylinderList("SpherocylinderList 2", sPArray2, 3); 
      Assert.assertEquals(" ", 6996733.041, sList2.totalVolume(), .0001);
   }
   
   /** A test that test averageSurfaceArea() methods. **/
   @Test public void averageSurfaceAreaTest() {
      Spherocylinder[] sPArray0 = {};
      SpherocylinderList sList0 
         = new SpherocylinderList("SpherocylinderList 0", sPArray0, 0);
      Assert.
         assertEquals(" ", 0, sList0.averageSurfaceArea(), .0001);
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder sP3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sPArray1 = {sP1, sP2, sP3};
      SpherocylinderList sList1 
         = new SpherocylinderList("SpherocylinderList 1", sPArray1, 3); 
      Assert.
         assertEquals(" ", 61596.808804, sList1.averageSurfaceArea(), .0001);
   }
   
   /** A test that test averageVolume() methods. **/
   @Test public void averageVolumeTest() {
      Spherocylinder[] sPArray0 = {};
      SpherocylinderList sList0 
         = new SpherocylinderList("SpherocylinderList 0", sPArray0, 0);
      Assert.
         assertEquals(" ", 0, sList0.averageVolume(), .0001);   
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder sP3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sPArray1 = {sP1, sP2, sP3};
      SpherocylinderList sList1 
         = new SpherocylinderList("SpherocylinderList 1", sPArray1, 3); 
      Assert.assertEquals(" ", 2332244.347, sList1.averageVolume(), .0001);
   }
   
   /** A test that test toString() methods. **/
   @Test public void toStringTest() {
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder sP3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sPArray1 = {sP1, sP2, sP3};
      SpherocylinderList sList1 
         = new SpherocylinderList("SpherocylinderList 1", sPArray1, 3); 
      Assert.assertTrue(" ", sList1.toString().contains("----- Summary for"));
   }
   
   /** A test that test getList() methods. **/
   @Test public void getListTest() {
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder sP3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sPArray1 = {sP1, sP2, sP3};
      SpherocylinderList sList1 
         = new SpherocylinderList("SpherocylinderList 1", sPArray1, 3); 
      Assert.assertArrayEquals(" ", sPArray1, sList1.getList());
   }           
   
   /** A test that test addSpherocylinder() 
   *  and deleteSpherocylinder() methods. **/
   @Test public void addandDeleteSpherocylinderTest() {
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder[] sPArray1 = new Spherocylinder[3];
      sPArray1[0] = sP1;
      sPArray1[1] = sP2;
      SpherocylinderList sList1 
         = new SpherocylinderList("SpherocylinderList 1", sPArray1, 2);
      Assert.
         assertFalse(" ", sList1.
            editSpherocylinder("Large Example", 99.32, 91.0));
      sList1.addSpherocylinder("Large Example", 98.32, 99.0);   
      Assert.assertEquals(" ", 3, sList1.numberOfSpherocylinders());
      sList1.deleteSpherocylinder("Small Example");
      Assert.assertEquals(" ", 2, sList1.numberOfSpherocylinders());
      sList1.deleteSpherocylinder("Large Example");
      sList1.deleteSpherocylinder("Medium Example");
      Assert.
         assertEquals(" ", null, sList1.
            deleteSpherocylinder("Large Example"));
   }
   
   /** A test that test 
   *  findSpherocylinder() methods. **/
   @Test public void findSpherocylinderTest() {
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder sP3 = new Spherocylinder("Large Example", 98.32, 99.0);
      
      Spherocylinder[] sPArray1 = {sP1, sP2, sP3};
      SpherocylinderList sList1 
         = new SpherocylinderList("SpherocylinderList 1", sPArray1, 3); 
      Assert.
         assertEquals(" ", sP3, sList1.
            findSpherocylinder("Large Example"));
      Assert.
         assertEquals(" ", null, sList1.
            findSpherocylinder("Giant Example"));
   }    
   
   /** A test that test editSpherocylinder() methods. **/
   @Test public void editSpherocylinderTest() {
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder[] sPArray1 = new Spherocylinder[3];
      sPArray1[0] = sP1;
      sPArray1[1] = sP2;
      SpherocylinderList sList1 
         = new SpherocylinderList("SpherocylinderList 1", sPArray1, 2);
      Assert.
         assertFalse(" ", sList1.
            editSpherocylinder("Large Example", 99.32, 91.0));
      
      sList1.addSpherocylinder("Large Example", 98.32, 99.0);   
      Assert.
         assertTrue(" ", sList1.
            editSpherocylinder("SmAlL ExAmPle", 99.32, 91.0));
      Assert.
         assertFalse(" ", sList1.
            editSpherocylinder("Giant Example", 99.32, 91.0));
   }
   /** A test that test 
   *  findSpherocylinderWithLargestVolume() methods. **/
   @Test public void findSpherocylinderWithLargestVolumeTest() {
      Spherocylinder sP1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sP2 = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder sP3 = new Spherocylinder("Large Example", 98.32, 99.0);
      
      Spherocylinder[] sPArray1 = {sP1, sP2, sP3};
      SpherocylinderList sList1 
         = new SpherocylinderList("SpherocylinderList 1", sPArray1, 3); 
      Assert.
         assertEquals(" ", sP3, sList1.
            findSpherocylinderWithLargestVolume());
            
      sList1.deleteSpherocylinder("Large Example");
      sList1.deleteSpherocylinder("Medium Example");
      sList1.deleteSpherocylinder("Small Example");
      Assert.
         assertEquals(" ", null, sList1.
            findSpherocylinderWithLargestVolume());
      Spherocylinder[] sPArray2 = {sP3, sP2, sP1};
      SpherocylinderList sList2 
         = new SpherocylinderList("SpherocylinderList 2", sPArray2, 3); 
      Assert.
         assertEquals(" ", sP3, sList2.
            findSpherocylinderWithLargestVolume());
   }       
          

         
              
}
