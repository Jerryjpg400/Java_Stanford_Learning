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
//		String FilePath = readLine("Input file? ");
		Election("res/polls.txt");
	}
	
	// return 
	private void Election (String FilePath) {
		try {
			int candidate1 = 0;
			int candidate2 = 0;
			Scanner input = new Scanner(new File(FilePath));
			while (input.hasNextLine()) {
				String line = input.nextLine();
				Scanner token = new Scanner(line);
				String word = token.next();
				int vote1 = token.nextInt();
				int vote2 = token.nextInt();
				int tickets = token.nextInt();
				if (vote1 > vote2) {
					candidate1 += tickets;
				} else {
					candidate2 += tickets;
				}
			}
			println("Candidate 1: " + candidate1 + " votes.");
			println("Candidate 2: " + candidate2 + " votes.");
			input.close();
		} catch (FileNotFoundException ex) {
			println("File Not Found!\n");
		}
		
	}
}
