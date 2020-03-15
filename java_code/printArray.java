import java.awt.*;
import acm.program.ConsoleProgram;
import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	public void run() {
		int[] numbers = {5, 32, 12, 2, 1, -1, 9};
		print(numbers);
	}
	
	private void print(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			printf("element [%d] is %d.\n", i, arr[i]);
		}
	}
}