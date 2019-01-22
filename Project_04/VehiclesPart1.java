/** 
* VehiclesPart1_Driver class.
* Project 4.
* @author Li-Kai Lin – cpsc1223 - Module 4
* @version 11_06_2018
*/
public class VehiclesPart1 {

    /**
    * main method of VehiclesPart1.
    * @param args - is not used.
    */
   public static void main(String[] args) {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy",
            45000, false, 5.0, 4);
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster",
            14000, false, 750);
      Car car2 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Truck truck2 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
      SemiTractorTrailer semi2 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy",
            45000, false, 5.0, 4);
      Motorcycle bike2 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster",
            14000, false, 750);         
      System.out.println(car1);
      System.out.println(truck1);
      System.out.println(semi1);
      System.out.println(bike1);
   }
}