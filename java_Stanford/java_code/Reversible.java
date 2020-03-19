import acm.graphics.*;
import acm.program.*;
import java.io.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	
	public void run() {
		String fileName = readLine("Enter the file name: ");
		Reversible(fileName);
	}
	
	private void Reversible(String fileName) {
		try {
			Scanner f = new Scanner(new File(fileName));
			ArrayList<String> line = new ArrayList<>();
			
			// Read all line and store in our ArrayList
			while (f.hasNextLine()) {
				line.add(f.nextLine());
			}
			
			// Output the lines from back to front
			for (int i = line.size()-1; i >= 0; i--) {
				println(line.get(i));
			}
			
		} catch (IOException ex) {
			println("Can not read the file.");
		}
	}
} 