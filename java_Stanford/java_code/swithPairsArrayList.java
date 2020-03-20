import acm.graphics.*;
import acm.program.*;
import java.io.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	
	public void run() {
		String[] word = {"bb", "a", "ddd", "c", "ee", "f", "g"};
		ArrayList<String> list = readData(word);
		println(list);
		switchPairs(list);
		println();
		println(list);
	}
	
	private void switchPairs(ArrayList<String> list) {
		for (int i = 0; i < list.size()-1; i += 2) {
			String str = list.get(i+1);
			list.set(i+1, list.get(i));
			list.set(i, str);
		}
	}
	
	private ArrayList<String> readData(String[] s) {
		ArrayList<String> word = new ArrayList<String>();
		for (int i = 0; i < s.length; i++) {
			word.add(s[i]);
		}
		return word;
	}
	
} 