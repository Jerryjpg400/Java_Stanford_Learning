import acm.graphics.*;
import acm.program.*;
import java.io.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	
	public void run() {
		ArrayList<String> tasks = new ArrayList<String> ();
		
		String task = readLine("Emter task: ");
		while (task.length() > 0) {
			tasks.add(task);
			task = readLine("Emter task: ");
		}
		
		println(tasks);
		
		for (int i = tasks.size()-1; i >= 0; i--) {
			tasks.remove(i);
		}
		println(tasks);
	}
	
} 