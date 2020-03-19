/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you
 * change the class name, you'll need to change the filename so that it matches.
 */

import acm.program.*;
import stanford.cs106.util.RandomGenerator;

public class BlankClass extends ConsoleProgram {
	public void run() {
		int disireNum = readInt("DisireNum? ");
		
		RollTwoDices(disireNum);
	}
	
	private void RollTwoDices (int disireNum) {
		int sum = 0;
		while (sum != disireNum) {
			int dice1 = RandomGenerator.getInstance().nextInt(1,6);
			int dice2 = RandomGenerator.getInstance().nextInt(1,6);
			sum = dice1 + dice2;
			printf("%d and %d = %d\n", dice1, dice2, sum);
		}
	}
}

