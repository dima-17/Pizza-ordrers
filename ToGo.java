public class ToGo extends PizzaOrder{

    // default constructor
    public ToGo() {
    }

    // non default constructor
    public ToGo(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
        super(customerName, pizzaSize, numberOfToppings, toppingPrice);
    }

    // To return all information about the object
    @Override
    public String toString() {
        String resString =  "ToGO [\ncustomer Name: " + getCustomerName() + "\ndate Ordered: " + getDateOrdered() ;
        if (getPizzaSize() == SMALL)
            resString += "\npizza Size = SMALL";
        else if (getPizzaSize() == MEDIUM)
            resString += "\npizza Size: MEDIUM";
        else if (getPizzaSize() == LARGE)
            resString += "\npizza Size: LARGE";
        return resString + "\nnumber Of Toppings = "+getNumberOfToppings()+"\ntopping Price = "+getToppingPrice()+
                "\nOrder Price = "+(int)calculateOrderPrice()+"\n]" ;
    }

}
