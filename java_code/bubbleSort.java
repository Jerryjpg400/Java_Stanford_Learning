import java.awt.*;
import acm.program.ConsoleProgram;
import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	public void run() {
		int[] numbers = {5, 32, 12, 2, 1, -1, 9};
		sort(numbers);
		println(Arrays.toString(numbers));
	}
	
	private void sort(int[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < len-i; j++) {
				if (arr[j] > arr[j+1]) {
					swapArray(arr, j, j+1);
				}
			}
		}
	}
	
	private void swapArray(int[] arr, int pos1, int pos2) {
		int temp = 0;
		temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
}