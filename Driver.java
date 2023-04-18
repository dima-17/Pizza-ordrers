import java.util.ArrayList;
import java.util.Collections;

public class Driver {

    public static void main(String[] args) {

        //Create a ArrayList of pizza order type and add objects to it from different classes
        ArrayList<PizzaOrder> orders = new ArrayList<>();
        orders.add(new Delivery("Dima",PizzaOrder.LARGE,3,10,10,3));
        orders.add(new Seated ("Hanaa", PizzaOrder.SMALL,3,1,2,3));
        orders.add(new Seated("Rami", PizzaOrder.LARGE,4,2,4,5));
        orders.add(new Delivery("Lana",PizzaOrder.MEDIUM,2,5,20,2));
        orders.add(new ToGo("Zain", PizzaOrder.MEDIUM,4,5));

        // Call method to Sort orders then print information for each object orders
        sortOrders(orders);
        for (PizzaOrder order : orders)
            order.printOrderInfo();

        // Call method to calculate Total Orders Price
        System.out.println("\n "+"Total price for all orders = "+calculateTotalOrdersPrice(orders));

        System.out.println("\n"+orders.get(1));

    }

    public static void sortOrders (ArrayList<PizzaOrder> orders) {
        //use Collections class to sort orders (Collections class will use method compareTo in PizzaOrder class)
        Collections.sort(orders);
    }

    public static double calculateTotalOrdersPrice (ArrayList<PizzaOrder> orders) {
        // find the sum for Total Order Price
        double sum=0;
        for (PizzaOrder order : orders)
            sum += order.calculateOrderPrice();
        return sum;
    }
}
