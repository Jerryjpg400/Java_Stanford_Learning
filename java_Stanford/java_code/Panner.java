import acm.graphics.*;
import acm.program.*;
import java.io.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	
	public void run() {
		// Read task
		ArrayList<String> enteredList = readTask();
		ArrayList<String> orderedList = new ArrayList<> ();
		
		println("Great! Enter the order to complete your tasks.");
		while (!enteredList.isEmpty()) {
			println("Task remaining : " + enteredList);
			String task = readLine("Enter you want to complete: ");
			if (enteredList.contains(task)) {
				enteredList.remove(task);
				orderedList.add(task);
			} else {
				println("That's not on your list - stay focused!");
			}
		}
		
		println(orderedList);
	}
	
	private ArrayList<String> readTask() {
		ArrayList<String> tasks = new ArrayList<String> ();
		
		String task = readLine("Emter task: ");
		while (task.length() > 0) {
			tasks.add(task);
			task = readLine("Emter task: ");
		}
		return tasks;
	}
	
} 