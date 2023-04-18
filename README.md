# Pizza-ordrers
Java program that takes 5 different pizza orders and prints them sorted, with the total sum of all order prices.
Write a complete Java program that creates the following classes:
1-	class PizzaOrder which implements the Comparable interface and contains the following attributes and member methods:
o	customerName ( String )
o	dateOrdered ( Date )
o	pizzaSize (final static int  SMALL=1, MEDIUM=2, LARGE=3)
o	numberOfToppings ( int )
o	toppingPrice ( double )
o	Appropriate constructors ( default and non default ) as well as the appropriate setter and getter methods.  
o	A toString( ) method.
o	Method calculateOrderPrice() which calculates the price of the pizza order as follows:
( numberOfToppings * toppingPrice ) * pizzaSize
o	Method printOrderInfo () which prints only the customer’s name and the calculated order price on one line to the screen.

2-	class Delivery which extends PizzaOrder and contains the following attribute and methods:
o	tripRate ( double )
o	zone ( int 1-4)
o	Appropriate constructors ( default and non default ) as well as the appropriate setter and getter methods.  
o	toString() method that overrides the method in PizzaOrder.
o	A calculateOrderPrice() method which overrides the method in PizzaOrder and  adds the ( tripRate/100 * totalprice * zone ) to the price.
3-	class ToGo which extends PizzaOrder.
4-	Class Seated which extends PizzaOrder and contains the following attribute and methods:
o	serviceCharge ( double )
o	numberOfPeople ( int )
o	toString() method that overrides the method in PizzaOrder.
o	A calculateOrderPrice() method which overrides the method in PizzaOrder and  adds the ( serviceCharge * numberOfPeople ) to the price.
5-	A Driver class which includes the following methods:
o	main method that does the following:
-	creates an ArrayList called orders of type PizzaOrder and adds five different orders to it ( two Delivery, one ToGo, and two Seated ).  
You must not ask the user to enter the attributes but you should fill them up directly in the main method. Make sure your constructors follow the same order of attributes as specified above as follows:
PizzaOrder (customerName, pizzaSize, numberOfToppings, toppingPrice)
Delivery (customerName,  pizzaSize, numberOfToppings, toppingPrice, tripRate, zone)
ToGo (customerName, pizzaSize, numberOfToppings, toppingPrice)
Seated (customerName,  pizzaSize, numberOfToppings, toppingPrice, serviceCharge, numberOfPeople)

-	Sorts the orders based on their calculated order price.
-	Prints the sorted orders customer names and prices.
-	Prints the total sum of all order prices.
-	Prints a report ( all properties and  order price ) for the second Delivery order ( orders.get(1) ).
o	Method sortOrders which takes an ArrayList of type PizzaOrder as an argument and sorts it.  You may use the java.util.Collections.sort method to do the actual sorting.
o	Method calculateTotalOrdersPrice which takes an ArrayList of type PizzaOrder as an argument and returns the total price of all the orders in that ArrayList.
