/* File: Histogram.java
 * --------------------
 * A program that reads in temperature data from
 * temps.txt and outputs a histogram of the data using
 * an array as a frequency counter.
 * --------------------
 */

import java.io.*;
import java.util.*;
import acm.program.*;
import acm.util.*;

public class Histogram extends ConsoleProgram {
	public void run() {
		int[] counts = readData("res/temps.txt");
		displayHistogram(counts);
	}

	/* Reads words from the given file and returns
	 * an array histogram where index [i] stores how many words
	 * are length 'i'. */
	private int[] readData(String filename) {
		int[] counts = new int[100];	// temps 0-99
		try {
			Scanner input = new Scanner(new File(filename));
			while (input.hasNextInt()) {
				int temp = input.nextInt();
				counts[temp]++;
			}
		} catch (IOException e) {
			println("I/O error: " + e);
		}
		return counts;
	}

	/* Prints a histogram of stars, one for every 100 words that
	 * were that length. */
	private void displayHistogram(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) {
				print(i + ": ");
				for (int j = 0; j < counts[i]; j++) {
					print("*");
				}
				println();
			}
		}
	}
}
