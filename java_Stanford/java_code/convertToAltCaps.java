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
		convertToAltCaps("Pikachu");
	}
	private void convertToAltCaps (String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
//			char cha = Character.toLowerCase(s.charAt(i));
			if (i % 2 == 0) {
				str += String.valueOf(Character.toLowerCase(s.charAt(i)));
			} else {
				str += String.valueOf(Character.toUpperCase(s.charAt(i)));
			}
		}
		println(str);
	}
}

