/*
 * CS 106A, Week 3, File Processing
 * 
 * This program computes leader in presidential polls, based on
 * an input file such as: 
 * AK 42 53 3 Oct Ivan Moore Research
 * AZ 71 26 6 Sep University of Arizona McKale Center
 */

import acm.program.*;
import java.io.*;    // for File
import java.util.*;  // for Scanner

public class Election extends ConsoleProgram {
	public void run() {
		String filename = promptUserForFile("Polls filename? ", "res");
		
		try {
			Scanner input = new Scanner(new File(filename));
			int totalVotes1 = 0;
			int totalVotes2 = 0;
			while (input.hasNextLine()) {
				// e.g. "AL 34 54 9 Oct Capital Survey"
				String line = input.nextLine();
				
				// Make a new scanner to help parse this one line
				Scanner tokens = new Scanner(line);
				tokens.next();        // e.g. "AL" (do nothing with this)
				int votes1 = tokens.nextInt();   // e.g. 34
				int votes2 = tokens.nextInt();   // e.g. 54
				int evotes = tokens.nextInt();   // e.g. 9
				if (votes1 > votes2) {
					totalVotes1 += evotes;
				} else {
					totalVotes2 += evotes;
				}
			}
			input.close();

			println("Candidate 1 earned " + totalVotes1 + " votes.");
			println("Candidate 2 earned " + totalVotes2 + " votes.");
		} catch (IOException ex) {
			println("Error reading file: " + ex);
		}
	}
}
