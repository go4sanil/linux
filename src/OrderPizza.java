/*9.	Write a program to prepare the bill for a pizza shop.
a.	Assume an order and work out the final bill.
b.	Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
c.	For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
d.	Extra cheese for any size pizza: + $1
For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
“Your final bill is $24”
*/
public class OrderPizza {

	public static void main(String[] args) {

		int priceSmallPizza = 15;
		int priceMediumPizza = 20;
		int priceLargePizza = 25;
		int pepperoniSmallPizza = 2;
		int pepperoniMediumAndLargePizza = 3;
		int extraCheese = 1;

		String pizzaOrder = "largePizza";
		boolean pepperoniOrder = false;
		boolean cheeseOrder = false;

		switch (pizzaOrder) {
		case "smallPizza": {
			if (cheeseOrder && pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceSmallPizza + pepperoniSmallPizza + extraCheese));

			}

			else if (cheeseOrder && !pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceSmallPizza + extraCheese));

			}

			else if (!cheeseOrder && pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceSmallPizza + pepperoniSmallPizza));

			}

			else {
				System.out.println("Your final bill is:" + (priceSmallPizza));
				break;
			}
		}

		case "mediumPizza": {

			if (cheeseOrder && pepperoniOrder) {
				System.out.println(
						"Your final bill is:" + (priceMediumPizza + pepperoniMediumAndLargePizza + extraCheese));

			}

			else if (cheeseOrder && !pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceMediumPizza + extraCheese));
				;
			}

			else if (!cheeseOrder && pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceMediumPizza + pepperoniMediumAndLargePizza));

			}

			else {
				System.out.println("Your final bill is:" + (priceMediumPizza));
				break;
			}
		}

		case "largePizza": {
			if (cheeseOrder && pepperoniOrder) {
				System.out.println(
						"Your final bill is:" + (priceLargePizza + pepperoniMediumAndLargePizza + extraCheese));

			}

			else if (cheeseOrder && !pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceLargePizza + extraCheese));

			}

			else if (!cheeseOrder && pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceLargePizza + pepperoniMediumAndLargePizza));

			}

			else {
				System.out.println("Your final bill is:" + (priceMediumPizza));
				break;
			}

		}
		default:
			System.out.println("Please check the details of order and try again");
		}
	}

}
