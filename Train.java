import java.util.ArrayList;
public class Train {

     /*arraylist to store the cars attatched */
     private ArrayList<Car> train_cars = new ArrayList<Car>();

     /*declaring engine for train */
     Engine myEngine;

     /*integer for storing train's max capacity */
     int maxCapacity;

     /*int for storing number of cars */
     int numberCars;


     /**train constructor 
      * @param FuelType
      * @param double for fuel capacity
      * @param int for number of cars
      * @param int for passenger capacity
     */
     public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        FuelType train_fuel_type = fuelType;
        double train_fuel_capacity = fuelCapacity;
        numberCars = nCars;
        maxCapacity = passengerCapacity;
        myEngine = new Engine(train_fuel_type, train_fuel_capacity);
        int carCapacity = maxCapacity / nCars;
        for (int i = 0; i<nCars; i++) {
            Car myCar = new Car(carCapacity);
            train_cars.add(myCar);
        }
        int cabooseCapacity = passengerCapacity % nCars;
        Car caboose = new Car(cabooseCapacity);
        train_cars.add(caboose);
     }

     /**Engine getter
      * @returns train's engine
      */
     public Engine getEngine() {
        return this.myEngine;
     }

     /**Car getter
      * @param integer in arraylist of car being got
      * @returns that car
      */
      public Car getCar(int i) {
        return train_cars.get(i);
      }

      /**maximum capacity getter
       * @returns int total maximum capacity of the cars in the train
       */
      public int getMaxCapacity(){
        return this.maxCapacity;
      }

      /**remaining seats getter
      * calls seatsRemaining method from Cars for each car
       * @returns int of the number of seats remaining across all cars
       */
      public int seatsRemaining() {
        int seatsRemaining = 0;
        for (int i = 0; i < this.numberCars; i++) {
            int carSeats = train_cars.get(i).seatsRemaining();
            seatsRemaining += carSeats;
        }
        return seatsRemaining;
      }

      /**print manifest method
       * no parameters and returns nothing
       * calls printManifest method from Car for each car with addition print statement to show all passengers in each car
       */
      public void printManifest() {
        for (int i = 0; i < this.numberCars; i++) {
            System.out.println("Car " + i + " manifest: ");
            train_cars.get(i).printManifest();
            System.out.println("\n");
        }
      }

     public static void main(String[] args) {
        //test code
        // Train myTrain = new Train(FuelType.ELECTRIC, 30.00, 3, 15);
        // myTrain.myEngine.refuel();
        // myTrain.myEngine.go();

        // Passenger pass1 = new Passenger("Simone");
        // Passenger pass2 = new Passenger("Mazzy");
        // Passenger pass3 = new Passenger("Bert");
        // Passenger pass4 = new Passenger("Herb");
        // Passenger pass5 = new Passenger("George");
        // Passenger pass6 = new Passenger("Ketone");

        // myTrain.train_cars.get(0).addPassenger(pass1);
        // myTrain.train_cars.get(0).addPassenger(pass2);
        // myTrain.train_cars.get(0).addPassenger(pass3);
        // myTrain.train_cars.get(1).addPassenger(pass4);
        // myTrain.train_cars.get(1).addPassenger(pass5);
        // myTrain.train_cars.get(2).addPassenger(pass6);

        // System.out.println("seats remaining: " + myTrain.seatsRemaining());
        // myTrain.printManifest();

        // myTrain.train_cars.get(0).removePassenger(pass1);
        // myTrain.train_cars.get(0).printManifest();
     }

}

