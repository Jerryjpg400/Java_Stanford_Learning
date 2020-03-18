import java.awt.*;
import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import stanford.cs106.util.RandomGenerator;

import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	
	public void run() {
		int num = 340331378;
//		int freq = mostFrequentDigits(num);
		println("Returned :" + mostFrequentDigits(num));
	}
	private int mostFrequentDigits(int n) {
		int[] counters = new int[10];
		while (n > 0) {
			int lastDigit = n % 10;
			println("last digit is " + lastDigit);
			n /= 10;
			counters[lastDigit]++;
		}
		
		println("Counter is : " + Arrays.toString(counters));
		return 0;
	}
}