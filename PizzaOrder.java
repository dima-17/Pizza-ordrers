import java.util.Date;
public class PizzaOrder implements Comparable<PizzaOrder> {

    // The properties
    private String customerName ;
    private Date dateOrdered = new Date();
    private int pizzaSize ;
    private int numberOfToppings ;
    private double toppingPrice ;
    final static int  SMALL=1 , MEDIUM=2 , LARGE=3;

    // default constructor
    public PizzaOrder() {
    }

    // non default constructor
    public PizzaOrder(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
        super();
        this.customerName = customerName;
        this.pizzaSize = pizzaSize;
        this.numberOfToppings = numberOfToppings;
        this.toppingPrice = toppingPrice;
    }

    // setter & getter for each properties
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Date getDateOrdered() {
        return dateOrdered;
    }
    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }
    public int getNumberOfToppings() {
        return numberOfToppings;
    }
    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }
    public double getToppingPrice() {
        return toppingPrice;
    }
    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }
    public int getPizzaSize() {
        return pizzaSize;
    }
    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    // find the price for the Object
    public double calculateOrderPrice(){
        return ( numberOfToppings * toppingPrice ) * pizzaSize;
    }

    // To print specific information about the object
    public void printOrderInfo() {
        System.out.println("[customer Name = " + customerName + ", Order Price = " + (int)calculateOrderPrice() + "]");
    }

    // To return all information about the object
    @Override
    public String toString() {
        String resString =  "PizzaOrder [\ncustomer Name = " + customerName + "\ndate Ordered = " + dateOrdered ;
        if (pizzaSize == SMALL)
            resString += "\npizza Size: SMALL";
        else if (pizzaSize == MEDIUM)
            resString += "\npizza Size: MEDIUM";
        else if (pizzaSize == LARGE)
            resString += "\npizza Size: LARGE";
        return resString + "\nnumber Of Toppings = "+numberOfToppings+"\ntopping Price = "+toppingPrice+"\nOrder Price = "
                +(int)calculateOrderPrice()+"\n]";
    }

    // representation for comperTo Method because it in Interface Comparable
    @Override
    public int compareTo (PizzaOrder P){
        if (calculateOrderPrice()> P.calculateOrderPrice())
            return 1 ;
        else if (calculateOrderPrice()< P.calculateOrderPrice())
            return -1 ;
        else
            return 0 ;
    }
}
