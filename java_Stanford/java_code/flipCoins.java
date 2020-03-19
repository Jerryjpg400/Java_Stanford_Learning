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
		flipCoins("res/weather.txt");
	}
	
	// return 
	private void flipCoins (String FilePath) {
		try {
			Scanner input = new Scanner(new File(FilePath));
			while (input.hasNextLine()) {
				int count = 0;
				int Tcount = 0;
				double per = 0;
				String line = input.nextLine();
				Scanner token = new Scanner(line);
				
				while (token.hasNext()) {
					String word = token.next().toLowerCase();
					count++;
					if (word.equals("h")) {
						Tcount++;
					}
				}
				per = ((Tcount*1.0) / count) * 100;
				int end_per = (int) per;
//				println(per);
				printf("%d heads (%d%%)\n", Tcount, end_per);
				if (end_per > 50) {
					println("There were more heads!");
				}
				println();
			}
			input.close();
		} catch (FileNotFoundException ex) {
			println("File Not Found!\n");
		}
		
	}
}
