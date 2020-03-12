/*
 * File: Receipt.java
 * ---------------------
 * This program starts by asking the user for the cost of
 * their meal.  Then, it computes the tax, tip and total
 * meal price and prints them to the screen.
 */

import acm.program.*;

public class Receipt extends ConsoleProgram {
	public void run() {
		double subtotal = readDouble("What was the meal cost? $");
		double tax = subtotal * 0.08;
		double tip = subtotal * 0.20;
		double total = subtotal + tax + tip;
		
		println("Tax: $" + tax);
		println("Tip: $" + tip);
		println("Total: $" + total);
	}
}
