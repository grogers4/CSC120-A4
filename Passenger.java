public class Passenger {
    
    private String name;


    public Passenger(String name) {
        this.name = name;
    }

    /** passenger name getter
     * no parameters
     * @returns string of a Passanger's name
    */
    public String getName() {
        return this.name;
    }

    /** board car method
     * @parameter of Car being boarded
     * calls c.addPassenger and makes informative print statement depending on whether boarding was successful
     * returns nothing
     */
    public void boardCar(Car c) {
        if (c.addPassenger(this)) {
            System.out.println(this.name + " is onboard! Choo Choo!");
        }
        else {
            System.out.println("boarding unsuccessful. This car may be full ( :( ), or you're already onboard ( :) )");
        }
    }

    /** getting off car method
     * @param of Car getting off of
     * calls c.removePassenger and makes informative print statement depending on returned value
     * returns nothing
     */
    public void getOffCar(Car c) {
        if (c.removePassenger(this)) {
            System.out.println(this.name + "has exited the car");
        } else {
            System.out.println("you cannot get off a car you are not on");
        }
    }
    public static void main(String[] args) {
    }

}
