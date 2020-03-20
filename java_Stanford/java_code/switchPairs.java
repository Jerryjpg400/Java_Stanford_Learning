import java.awt.*;
import acm.program.ConsoleProgram;
import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	public void run() {
		String[] a = {"a", "bb", "c", "ddd", "ee", "f", "g"};
		String[] b = {"a", "bb", "c", "ddd", "ee", "f", "g", "h"};
		println("before sort is : " + Arrays.toString(a));
		switchPairs(a);
		println("after sort is : " + Arrays.toString(a));
		println();
		println();
		println();
		println("before sort is : " + Arrays.toString(b));
		switchPairs(b);
		println("after sort is : " + Arrays.toString(b));
	}
	
	private void switchPairs(String[] arr) {
		for (int i = 0; i < arr.length-1; i += 2) {
			String temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}

import java.awt.*;
import acm.program.ConsoleProgram;
import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	public void run() {
		String[] a = {"a", "bb", "c", "ddd", "ee", "f", "g"};
		String[] b = {"a", "bb", "c", "ddd", "ee", "f", "g", "h"};
		println("before sort is : " + Arrays.toString(a));
		switchPairs(a);
		println("after sort is : " + Arrays.toString(a));
		println();
		println();
		println();
		println("before sort is : " + Arrays.toString(b));
		switchPairs(b);
		println("after sort is : " + Arrays.toString(b));
	}
	
	private void switchPairs(String[] arr) {
		for (int i = 0; i < arr.length-1; i += 2) {
			String temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}

}