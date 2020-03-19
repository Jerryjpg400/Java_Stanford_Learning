/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you
 * change the class name, you'll need to change the filename so that it matches.
 */

import acm.program.*;
import stanford.cs106.util.RandomGenerator;

public class BlankClass extends ConsoleProgram {
	public void run() {
		nameDiamond("MARTY");
	}
	private void nameDiamond (String s) {
		int len = s.length();
		for (int i = 1; i <= len; i++) {
			println(s.substring(0, i));
		}
		for (int i = 0; i < len-1; i++) {
			for (int j = 0; j < i+1; j++) {
				print(" ");
			}
			println(s.substring(i+1));
		}
	}
}

