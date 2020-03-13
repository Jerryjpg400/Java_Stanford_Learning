/* File: MyWeatherStation
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

public class MyWeatherStation extends ConsoleProgram {
	public void run() {
		// 1) Read in temperatures from the user
		int[] temps = readTemperatures();
		println("Temperatures: " + Arrays.toString(temps));
		println();
		
		// 2) Calculate statistics with average
		double average = computeAverage(temps);
		println("Average temp = " + average);
		int aboveAverageCount = countAboveAverage(temps, average);
		println(aboveAverageCount + " days above average.");
		
		// 3) print out 2 hottest and 2 coldest days
		Arrays.sort(temps);
		println("Two coldest days: " + temps[0] + ", " + temps[1]);
		println("Two hottest days: " + temps[temps.length - 1] + ", " + temps[temps.length - 2]);
	}
	
	private int[] readTemperatures() {
		int days = readInt("How many days' temperatures? ");
		int[] temps = new int[days];
		for (int i = 0; i < temps.length; i++) {
			temps[i] = readInt("Day " + (i + 1) + "'s high temp: ");
		}
		
		return temps;
	}
	
	private double computeAverage(int[] numbers) {
		double sum = 0.0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum / numbers.length;
	}
	
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
