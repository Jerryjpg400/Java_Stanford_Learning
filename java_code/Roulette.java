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
		Roulette();
	}
	
	private void Roulette () {
		// player's money at the begin
		int playerMoney = 10;
		int maxMoney = 0;
	    while (playerMoney < 1000 && playerMoney > 0) {
	    	// Generate a random deposit
			int play_bet = RandomGenerator.getInstance().nextInt(4);
			// player's money after minus 
		    playerMoney -= play_bet;
		    // Generate a random wheel number
		    int wheel = RandomGenerator.getInstance().nextInt(36);
		    
		    if (wheel >= 1 && wheel <= 18) {
		    	playerMoney += 3;
		    } else {
		    	playerMoney -= 3;
		    }
		    if (playerMoney < 0) {
		    	playerMoney = 0;
		    }
		    if (playerMoney > maxMoney) {
		    	maxMoney = playerMoney;
		    }
		    
		    printf("bet $%d, spin %d, money = $%d\n",
		    		play_bet, wheel, playerMoney);
	    }
	    printf("max = %d\n", maxMoney);
	}
}

