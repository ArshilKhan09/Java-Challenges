public class car {

      int noOfWheels ;
      String colur ;
      float maxSpeed ;
      float currentFuelInLitre ;
      int noOfSeats ;      
      
      public void drive() {
        System.out.println("The Car is Driving ");
        currentFuelInLitre-- ;
      }
      public void addFuel(float fuel){
        currentFuelInLitre += fuel;
      }
      public float getCurrentFuelLevel(){
        return currentFuelInLitre ;
      }
}
