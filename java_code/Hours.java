/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you
 * change the class name, you'll need to change the filename so that it matches.
 */

import acm.program.*;
import java.io.*;
import java.util.*;

import javax.naming.NameAlreadyBoundException;

public class BlankClass extends ConsoleProgram {
	public void run() {
		String FilePath = readLine("Input file? ");
		Hours(FilePath);
	}
	
	// return 
	private void Hours (String FilePath) {
		try {
			Scanner input = new Scanner(new File(FilePath));
			while (input.hasNextLine()) {
				String line = input.nextLine();		
				Scanner token = new Scanner(line);
				while (token.hasNext()) {
					double total_work = 0.0;
					int count = 0;
					String ID = token.next();
					String name = token.next();
					while (token.hasNextDouble()) {
						double work = token.nextDouble();
						count++;
						total_work += work;
					}
					double everyDay = total_work / count;
					print(name + " (ID#" + ID + ") " +" worked " + total_work);
					println(" hours" + " (" + everyDay + "/day)");
				}
			}
			input.close();
		} catch (FileNotFoundException ex) {
			println("File Not Found!\n");
		}
		
	}
}


/*
 * File: res/hours.txt
 * 123 Amy 12.5 8.5 7.25 3.25
 * 456 Miles 4.0 11.6 6.5 12.2 2.7
 * 802 Jessie 1.5
 * 647 Vilde 8.0 3.5 6.5
 */