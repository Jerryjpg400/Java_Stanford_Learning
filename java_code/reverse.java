/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you
 * change the class name, you'll need to change the filename so that it matches.
 */

import acm.program.*;
import stanford.cs106.util.RandomGenerator;

public class BlankClass extends ConsoleProgram {
	private static int count = 0;
	
	public void run() {
		println(reverse("Pikachu"));
	}
	private String reverse (String s) {
		String w = "";
		int len = s.length()-1;
		for (int i = len; i >= 0; i--) {
			w += s.substring(i, i+1);
		}
		return w;
	}
	
}

