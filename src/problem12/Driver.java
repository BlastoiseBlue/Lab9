/*
 * Emmet Stanevich
 * 10/26/17
 * Problem 12
 */
package problem12;

import problem11.Pizza;

public class Driver {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza(3, 2, 1, 4);
		// System.out.println(pizza1.calcCost());
		Pizza pizza2 = new Pizza("small", 3, 2, 5);
		// System.out.println(pizza2.calcCost());
		PizzaOrder order = new PizzaOrder();
		order.setNumPizzas(2);
		order.setPizza1(pizza1);
		order.setPizza2(pizza2);
		System.out.println(order.pizza1.calcCost());
		System.out.println(order.pizza2.calcCost());
		order.outputTotal();
	}

}
