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
		printcontainsTwice("hello", "l");
	}
	
	private void printcontainsTwice(String s, String repeatChar) {
		println(containsTwice(s, repeatChar) + " Repeat time is " + count);
	}
	
	private boolean containsTwice (String s, String repeatChar) {
		Boolean ans = false;
		// count repeat times of character
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char cha = s.charAt(i);
			String str = String.valueOf(cha);
			if (str.equals(repeatChar)) {
				count += 1;
			}
			if (count >= 2) {
				ans = true;
				break;
			}
		}
		return ans;
	}
}

