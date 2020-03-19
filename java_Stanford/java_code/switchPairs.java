import java.awt.*;
import acm.program.ConsoleProgram;
import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	public void run() {
		String[] a = {"a", "bb", "c", "ddd", "ee", "f", "g"};
		String[] b = {"a", "bb", "c", "ddd", "ee", "f", "g", "h"};
		switchPairs(a);
		switchPairs(b);
		println("after sort is : " + Arrays.toString(a));
		println();
		println();
		println();
		println("after sort is : " + Arrays.toString(b));
	}
	
	private void switchPairs(String[] arr) {
		int len = arr.length;
		if (isEven(arr)) {
			for (int i = 0; i < len-1; i++) {
				if (i % 2 == 0) {
					println("before swap : " + arr[i] + " " + arr[i+1]);
					swapArray(arr, i, i+1);
					println("swap " + arr[i] + " " + arr[i+1]);
				}
			}
		} else {
			for (int i = 0; i < len-2; i++) {
				if (i % 2 == 0) {
					println("before swap : " + arr[i] + " " + arr[i+1]);
					swapArray(arr, i, i+1);
					println("after swap : " + arr[i] + " " + arr[i+1]);
				}
			}
		}
	}
	
	private boolean isEven(String[] arr) {
		int len = arr.length;
		if (len % 2 == 0) {
			return true;
		}
		return false;
	}
	
	private void swapArray(String[] arr, int pos1, int pos2) {
		String temp = "";
		temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
}