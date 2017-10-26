/*
 * Emmet Stanevich
 * 10/26/17
 * Problem 11
 */
package problem11;

public class Driver {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza("Medium");
		Pizza pizza3 = new Pizza(3, 3, 2, 5);
		pizza1.getDescription();
		pizza2.getDescription();
		pizza3.getDescription();
	}

}
