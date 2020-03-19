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
		println(isPalindrome("madam"));
		println(isPalindrome("racecar"));
		println(isPalindrome("dog god"));
		println(isPalindrome("123 $$ 321"));
		println(isPalindrome("Madam"));
		println(isPalindrome("RACEcar"));
		println("```````````````````````````````");
		println(isPalindrome("beaty"));
		println(isPalindrome("beeb"));
		
	}
	
	private Boolean isPalindrome (String s) {
		s = s.toLowerCase();
		boolean ans = false;
		int len = s.length();
		int even_mid = len/2;
		int odd_mid = len/2;
		String str_even_before = s.substring(0, even_mid);
		String str_odd_before = s.substring(0, odd_mid);
		String str_even_end = s.substring(even_mid);
		String str_odd_end = s.substring(odd_mid+1);

		if (isEven(len)) {
			if (str_even_before.equals(reverse(str_even_end))) {
				ans = true;
			}
		} else {
			if (str_odd_before.equals(reverse(str_odd_end))) {
				ans = true;
			}
		}
		
		return ans;
	}
	
	private String reverse (String s) {
		String w = "";
		int len = s.length()-1;
		for (int i = len; i >= 0; i--) {
			w += s.substring(i, i+1);
		}
		return w;
	}
	
	private Boolean isEven (int num) {
		boolean ans = false;
		if (num % 2 == 0) {
			ans = true;
		}
		return ans;
	}
}

