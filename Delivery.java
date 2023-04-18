public class Delivery extends PizzaOrder{

    // The properties
    private double tripRate ;
    private int zone ;

    // default constructor
    public Delivery() {
    }

    // non default constructor
    public Delivery(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice,  double tripRate, int zone) {
        super(customerName, pizzaSize, numberOfToppings, toppingPrice);
        this.tripRate = tripRate;
        this.zone = zone;
    }

    // setter & getter for each properties
    public double getTripRate() {
        return tripRate;
    }
    public void setTripRate(double tripRate) {
        this.tripRate = tripRate;
    }
    public int getZone() {
        return zone;
    }
    public void setZone(int zone) {
        this.zone = zone;
    }

    // find the price for the Object
    @Override
    public double calculateOrderPrice(){
        return (super.calculateOrderPrice() + (tripRate/100 * super.calculateOrderPrice() * zone));
    }

    // To return all information about the object
    @Override
    public String toString() {
        String resString =  "Delivery [\ncustomer Name: " + getCustomerName() + "\ndate Ordered: " + getDateOrdered() ;
        if (getPizzaSize() == SMALL)
            resString += "\npizza Size: SMALL";
        else if (getPizzaSize() == MEDIUM)
            resString += "\npizza Size: MEDIUM";
        else if (getPizzaSize() == LARGE)
            resString += "\npizza Size: LARGE";
        return resString + "\nnumber Of Toppings = "+getNumberOfToppings()+"\ntopping Price = "+getToppingPrice()+
                "\nOrder Price = "+(int)calculateOrderPrice()+ "\nTrip Rate = " + tripRate + "\nzone=" + zone +"\n]" ;
    }

}
