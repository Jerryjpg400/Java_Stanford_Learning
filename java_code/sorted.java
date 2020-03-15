import java.awt.*;
import acm.program.ConsoleProgram;
import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	public void run() {
		double[] numbers = {7.0, 1.5, 4.3, 19.5, 25.1, 46.2};
		println(Arrays.toString(numbers));
		println("sorted :" + sorted(numbers));
		sort(numbers);
		println("after sorted is : " + Arrays.toString(numbers));
	}
	
	private boolean sorted(double[] arr) {
		int len = arr.length;
		double[] cp = Arrays.copyOf(arr, len);
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < len-i; j++) {
				if (arr[j] > arr[j+1]) {
					swapArray(arr, j, j+1);
				}
			}
		}
		return Arrays.equals(cp, arr);
	}
	
	private void sort(double[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < len-i; j++) {
				if (arr[j] > arr[j+1]) {
					swapArray(arr, j, j+1);
				}
			}
		}
	}
	
	private void swapArray(double[] arr, int pos1, int pos2) {
		double temp = 0;
		temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
}