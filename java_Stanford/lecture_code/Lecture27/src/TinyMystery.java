/*
 * File: TinyMystery.java
 * ---------------------
 * This class contains the introductory mystery example from the
 * lecture slides to show how Java treats objects versus primitives
 * as parameters.
 */

import java.util.Arrays;

import acm.program.*;

public class TinyMystery extends ConsoleProgram {
	
	public void run() {
		int[] myArray = {5, 10, 15};
		int x = 5;
		foo(myArray, x);
		println(Arrays.toString(myArray) + " " + x);
	}
	
	private void foo(int[] anArray, int x) {
		anArray[1] = 20;
		x = 7;
	}
}

