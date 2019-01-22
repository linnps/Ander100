//import java.util.ArrayList;
//import java.util.Scanner;
//import java.io.File;
//import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
* Defines objects with a name and a list of Spherocylinder objects.
*
* Project 3.
* @author Li-Kai Lin – cpsc1223 - Module 3
* @version 10_30_2018
*/   
public class SpherocylinderList {
   private String listName;
   private Spherocylinder[] sList;
   private int numberOfSpherocylinders;
   
   /**
    * Constuctor.
    * @param listNameIn for listName
    * @param sListIn for sList
    * @param numberOfSpherocylindersIn for numberOfSpherocylinders
    */
   public SpherocylinderList(String listNameIn, Spherocylinder[] sListIn, 
                        int numberOfSpherocylindersIn) {
      listName = listNameIn;
      sList = sListIn;
      numberOfSpherocylinders = numberOfSpherocylindersIn;
   }
   
   /**
    * Getter for listName.
    * @return listName
    */
   public String getName() {
      return listName;
   }
   
   /**
    * @return the number of Spherocylinder objects in the sList.
    */
   public int numberOfSpherocylinders() {
      return  numberOfSpherocylinders;
   }
   
   /**
    * Finds the total of the surface area using a while loop.
    *
    * @return the sum of all surface area in this sList object;
    *         return 0 if list is empty.
    */
   public double totalSurfaceArea() {
      double total = 0;
      
      int index = 0;
      while (index < numberOfSpherocylinders) {
         total += sList[index].surfaceArea();
         index++;  
      }   
      
      return total;
   }
   
   /**
    * Finds the total of the volume using a while loop.
    *
    * @return the sum of all volume in this sList object;
    *         return 0 if list is empty.
    */
   public double totalVolume() {
      double total = 0;
      
      int index = 0;
      while (index < numberOfSpherocylinders) {
         total += sList[index].volume();
         index++;  
      }   
      
      return total;
   }
   
   
   /**
    * Finds the average surface area.
    * @return average surface area in this sList object;
    *         return 0 if list is empty.
    */      
   public double averageSurfaceArea() {
      double average = 0;
      if (numberOfSpherocylinders > 0) {
         average = totalSurfaceArea() / numberOfSpherocylinders;
      }
      return average;
   }
   
   /**
    * Finds the average volume.
    * @return average volume in this sList object;
    *         return 0 if list is empty.
    */      
   public double averageVolume() {
      double average = 0;
      if (numberOfSpherocylinders > 0) {
         average = totalVolume() / numberOfSpherocylinders;
      }
      return average;
   }
   
   /**
    * @return the String representation of the SpherocylinderList.
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Spherocylinders: " + numberOfSpherocylinders();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()); 
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
      return result;
   }
   
   /**
    * Returns the array of Spherocylinder objects.
    * @return sList representing the array of 
    * Spherocylinder objects.
    */      
   public Spherocylinder[] getList() {
      return sList;
   }
   
  /**  
   * Add a Spherocylinder object to the list.
   * 
   * @param labelIn for label.
   * @param radiusIn for radius.
   * @param cylinderHeightIn for cylinder height.
   */   
   public void addSpherocylinder(String labelIn, 
      double radiusIn, double cylinderHeightIn) {
       
      Spherocylinder s 
         = new Spherocylinder(labelIn, radiusIn, cylinderHeightIn);
      sList[numberOfSpherocylinders] = s;
      numberOfSpherocylinders++;
   }
   
  /**
   * find a Spherocylinder from the list.
   *   
   * @param labelIn for label.
   * @return Spherocylinder if found else return null
   */   
   public Spherocylinder findSpherocylinder(String labelIn) {
   
      Spherocylinder result = null;
   
      for (int i = 0; i < numberOfSpherocylinders; i++) {
         if (sList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = sList[i];
            break;
         }
      }
      return result;
   }      
   
   
  /**
   * Deletes a Spherocylinder from the list.
   *   
   * @param labelIn for label.
   * @return Spherocylinder if deleted else return null
   */   
   public Spherocylinder deleteSpherocylinder(String labelIn) {
   
      Spherocylinder result = null;
   
      for (int i = 0; i < numberOfSpherocylinders; i++) {
         if (sList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = sList[i];
            for (int j = i; j < numberOfSpherocylinders - 1; j++) {
               sList[j] = sList[j + 1];
            }
            // overwrite duplicate at end
            sList[numberOfSpherocylinders - 1] = null; 
            numberOfSpherocylinders--;
            
            break;
         }
      }
   
      return result;
   }
   
  /**
   * edits a Spherocylinder from the list.
   *   
   * @param labelIn for label.
   * @param radiusIn for radius.
   * @param cylinderHeightIn for cylinder height.
   * @return true if edited else return false
   */   
   public boolean editSpherocylinder(String labelIn, 
      double radiusIn, double cylinderHeightIn) {
      for (int i = 0; i < numberOfSpherocylinders; i++) {
         if (sList[i].getLabel().equalsIgnoreCase(labelIn)) {
            sList[i].setRadius(radiusIn);
            sList[i].setCylinderHeight(cylinderHeightIn);
            return true;
         }
      }
   
      return false;
   }
   
   /**
    * @return the largest volume of Spherocylinder objects in the sList.
    */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      Spherocylinder sp = null;
      double largest = 0;
      int index = 0;
      while (index < numberOfSpherocylinders) {
         if (largest < sList[index].volume()) {
            largest = sList[index].volume();
            sp = sList[index];
         }
         index++;  
      }   
      
      return sp;
   }      
}
