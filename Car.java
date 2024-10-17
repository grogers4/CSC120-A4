import java.util.ArrayList;
public class Car {
    /*integer to store the car's capacity */
    private int capacity;

    /*arraylist to store the current passengers in the car */
    private ArrayList<String> current_passengers = new ArrayList<String>(capacity);

    /** constructor for the car
    * @param integer of car's capacity
     */
    public Car(int c) {
        capacity = c;
        current_passengers = new ArrayList<String>(capacity);
    }

    /** get capacity method
     * no parameters
     * @returns car's maximum capacity
     */
    public int getCapacity() {
        return this.capacity;
    }

    /** get remaining seats method
     * no parameters
     * @returns int of number of car's remaining seats
     */
    public int seatsRemaining() {
        int passenger_amt = current_passengers.size();
        int seats_remaining = this.capacity - passenger_amt;
        return seats_remaining;
    }

    /** add passenger method
     * @param of Passenger
     * @returns Boolean true if operation successful
     */
    public Boolean addPassenger(Passenger p) {
        if (current_passengers.size() < this.capacity) {
          String new_passenger = p.getName();
            if (this.current_passengers.contains(new_passenger)) {
                this.current_passengers.add(new_passenger);
                return true;
            } else {
                System.out.println("this passenger is already onboard");
                return false;
            }  
        } else {
            System.out.println("this car is at capacity, no more passengers can board");
            return false;
        }
        
    }

    /** remove passenger method
     * @param of Passenger to be removed
     * @returns Boolean true if operation successful
     */
    public Boolean removePassenger(Passenger p) {
        String removing_passenger = p.getName();
        if (this.current_passengers.indexOf(removing_passenger) > -1) {
            this.current_passengers.remove(removing_passenger);
            return true;
        } else {
            System.out.println("this passenger is not currently in this train car");
            return false;
        }
    }

    /** print manifest method
     * no parameters
     * prints manifest of passengers on board
     */
    public void printManifest() {
        if (current_passengers.size() > 0) {
            for(int i = 0; i < current_passengers.size(); i++) {   
                System.out.print(current_passengers.get(i) + "\n");
            }  
        } else {
            System.out.println("This car is EMPTY");
        }
    }

    public static void main(String[] args) {
    }
}
