public class Engine {
    /*String to store fuel type */
    public FuelType fuel_type;

    /*double to store fuel amount */
    private double fuel_amt;

    /*double to store maximum fuel */
    private double fuel_max;

    /*constructor for engine class
    * @param fuel type
    * @param fuel level
    * @param fuel capacity
    */
    public Engine(FuelType ft, double max) {
        this.fuel_type = ft;
        this.fuel_max = max;
        this.fuel_amt = max;
        }

    
    /*refueling method
     * no parameters
     * sets the current fuel amount to the max
     * returns nothing
     */
    public void refuel() {
        if (this.fuel_amt == this.fuel_max) {
            System.out.println("Already full");
        }
        this.fuel_amt = this.fuel_max;
    }

    /*"go" method
     * no parameters
     * reduces fuel level and prints new fuel level if there is enough fuel, otherwise makes print statement
     * ＠returns Boolean true if fuel level is above 0, false otherwise
     */
    public Boolean go() {
        if (this.fuel_amt >= 10) {
            this.fuel_amt = this.fuel_amt - 10;
        String fuel_amt_str = fuel_amt+"";
        System.out.println("Remaining fuel:" + fuel_amt_str);
        } else {
            System.out.println("Not enough fuel :(");
            return false;
        }
        if (this.fuel_amt > 0) {
            return true;
        } else {
            return false;
        }
        
    }


    public static void main(String[] args) {
        //test code
        // Engine myEngine = new Engine(FuelType.ELECTRIC, 50.00);
        // while (myEngine.go()) {
        //     System.out.println("Choo choo!");
        // }
        // System.out.println("Out of fuel.");
        // myEngine.refuel();
        // myEngine.go();
    }
}

    