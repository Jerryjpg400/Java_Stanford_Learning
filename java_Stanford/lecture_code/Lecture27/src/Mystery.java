/*
 * File: Mystery.java
 * ---------------------
 * This class contains the exact same code as the mystery trace from
 * lecture. Run it to compare what you think its output is going to be
 * to what it actually is.
 */

import java.util.Arrays;

import acm.program.*;

public class Mystery extends ConsoleProgram {
	
	public void run() {
		int[] a = {2, 0, 1};
		int b = 3;
		mystery(a, b, a[0]);
		println(Arrays.toString(a) + " " + b);
		
		b = a[0] + a[1] + a[2];
		mystery(a, a[1], a[2]);
		println(Arrays.toString(a) + " " + b);
	}
	
	public void mystery(int[] a, int b, int c) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * 2;
		}
		b++;
		c--;
		println(Arrays.toString(a) + " " + b + " " + c);
	}
}

