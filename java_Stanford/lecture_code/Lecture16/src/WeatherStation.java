/* File: WeatherStation
 * --------------------
 * This program shows how we can use arrays to do
 * more complex data manipulation.  It prompts the user
 * for a variable number of daily temperatures, and then prints
 * out all the entered temperatures along with statistics such as
 * the average, number of days above average,
 * and the hottest and coldest days.
 * --------------------
 */

import acm.program.*;
import java.util.*;

public class WeatherStation extends ConsoleProgram {
	public void run() {
		int[] temps = readTemperatures();
		double average = computeAverage(temps);
		int aboveAverageCount = countAboveAverage(temps, average);

		println("Temperatures: " + Arrays.toString(temps));
		println();
		println("Average temp = " + average);
		println(aboveAverageCount + " days above average.");
		println();

		Arrays.sort(temps);	// Sorts "in place"!
		println("Two coldest days: " + temps[0] + ", " + temps[1]);
		int hottest1 = temps[temps.length - 1];
		int hottest2 = temps[temps.length - 2];
		println("Two hottest days: " + hottest1 + ", " + hottest2);
	}
	
	/* This method reads in daily temperatures from the user,
	 * and returns an array of all entered temps.
	 */
	private int[] readTemperatures() {
	    int days = readInt("How many days' temperatures? ");
	    int[] temps = new int[days];
	    for (int i = 0; i < days; i++) {
	        temps[i] = readInt("Day " + (i + 1) + "'s high temp: ");
	    }
	    return temps;
	}

	// This method returns the average value in the given int array.
	private double computeAverage(int[] temps) {
	    double sum = 0.0;
	    for (int i = 0; i < temps.length; i++) {
	        sum += temps[i];
	    }
	    return sum / temps.length;
	}

	/* This method returns the number of elements in the
	 * given array above the given average.
	 */
	private int countAboveAverage(int[] temps, double average) {
	    int count = 0;
	    for (int i = 0; i < temps.length; i++) {
	        if (temps[i] > average) {
	            count++;
	        }
	    }
	    return count;
	}
}
