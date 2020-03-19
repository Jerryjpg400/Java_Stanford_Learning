import java.awt.*;
import acm.program.ConsoleProgram;
import java.applet.*;
import java.util.*;
import java.util.Arrays;


public class BlankClass extends ConsoleProgram{
	public void run() {
		int days = readInt("How many day's temperatures? ");
		readTem(days);
	}
	
	private void readTem(int days) {
		// Creating a array to store temperatures
		int[] tem = new int[days];
		int count = 0;
		// Read temperatures by defined days
		while (count < days) {
			int t = readInt("Day " + (count+1) + "'s high temp: ");
			tem[count] = t;
			count++;
		}
		
		// Print all temperatures as array
		println("All temperatures: " + Arrays.toString(tem));
		
		// Print Average temperatures
		double aveTem = sumArray(tem) / (days * 1.0);
		printf("Average temp = %.1f\n", aveTem);
		
		// Print how many days above the average
		println(aboveAverage(tem, aveTem) 
				+ " days were above average.");
		
		// Sort the array from small to large
		Arrays.sort(tem);
//		println(Arrays.toString(tem));
		if (days >= 2) {
			printf("Two coldest days: %d, %d.\n", tem[0], tem[1]);
			printf("Two hottest days: %d, %d.\n", tem[days-1], tem[days-2]);
		} else {
			println("Please input days more 2 days!");
		}
		
	}
	
	// Calculate total sum of array
	private int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	// Return how many days above the average temperatures
	private int aboveAverage(int[] arr, double aveTem) {
		int count = 0;
		for (int ele : arr) {
			if (ele > aveTem) {
				count++;
			}
		}
		return count;
	}
	
	// Sort the array from small to large
	private int[] sortArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = arr[i];
			}
		}
		return arr;
	}

}