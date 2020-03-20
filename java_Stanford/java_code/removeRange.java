import java.awt.*;
import acm.program.ConsoleProgram;
import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	public void run() {
		int[] a = {7, 9, 4, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7};
		ArrayList<Integer> list = readData(a);
		println(list);
		println();
		removeRange(list, 5, 7);
		println(list);
	}
	
	private void removeRange(ArrayList<Integer> list, int a, int b) {
		for (int i = list.size()-1; i >= 0; i--) {
			if (list.get(i) >= 5 && list.get(i) <= 7) {
				list.remove(i);
			}
		}
	}
	
	private ArrayList<Integer> readData(int[] s) {
		ArrayList<Integer> word = new ArrayList<Integer>();
		for (int i = 0; i < s.length; i++) {
			word.add(s[i]);
		}
		return word;
	}

}