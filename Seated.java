public class Seated extends PizzaOrder{

    // The properties
    private double serviceCharge ;
    private int numberOfPeople ;

    // default constructor
    public Seated() {
    }

    // non default constructor
    public Seated(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice, double serviceCharge, int numberOfPeople) {
        super(customerName, pizzaSize, numberOfToppings, toppingPrice);
        this.serviceCharge = serviceCharge;
        this.numberOfPeople = numberOfPeople;
    }

    // setter & getter for each properties
    public double getServiceCharge() {
        return serviceCharge;
    }
    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    public int getNumberOfPeople() {
        return numberOfPeople;
    }
    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    // find the price for the Object
    @Override
    public double calculateOrderPrice(){
        return (super.calculateOrderPrice() + (serviceCharge * numberOfPeople ));
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
                "\nOrder Price="+(int)calculateOrderPrice()+ "\nservice Charge = " + serviceCharge +
                "\nnumber Of People = " + numberOfPeople +"\n]" ;
    }
}
