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
		String message = readLine("Your message? ");
		int key = readInt("Encodeing key? ");
		CaesarCipher(message, key);
	}
	private void CaesarCipher (String message, int key) {
		message = message.toLowerCase();
		String secret_message = "";
		int len = message.length();
		for (int i = 0; i < len; i++) {
			char cha = message.charAt(i);
			if (cha >= 'a' && cha <= 'z') {
				cha += key;
				if (cha > 'z') {
					cha -= 26;
				}
				if (cha < 'a') {
					cha += 26;
				}
			}
			secret_message += cha;
		}
		println(secret_message.toUpperCase());
	}
}

