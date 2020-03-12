/*
 * File: CaesarCipher.java
 * -----------------------
 * This program translates a line of text into its Caesar cipher
 * form, and then decrypts it.
 */

import acm.program.*;

public class CaesarCipher extends ConsoleProgram {

	public void run() {
		println("This program uses a Caesar cipher for encryption.");
		int key = readInt("Enter encryption key: ");
		String plaintext = readLine("Plaintext:  ");
		
		String ciphertext = encryptCaesar(plaintext, key);
		println("Ciphertext: " + ciphertext);
		
		String decrypted = encryptCaesar(ciphertext, -key);
		println("Decrypted text: " + decrypted);
	}

	/*
	 * Encrypts a string by adding the value of key to each character.
	 * The first line makes sure that key is always positive by
	 * converting negative keys to the equivalent positive shift.
	 */
	private String encryptCaesar(String str, int key) {
		if (key < 0) {
			key = 26 + (key % 26);
		}
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = encryptCharacter(str.charAt(i), key);
			result += ch;
		}
		return result;
	}

	/*
	 * Encrypts a single character using the key given.  This
	 * method assumes the key is non-negative.  Non-letter
	 * characters are returned unchanged.
	 */
	private char encryptCharacter(char ch, int key) {
		if (Character.isLetter(ch)) {
			char uppercaseCh = Character.toUpperCase(ch);
			int charIndex = uppercaseCh - 'A';
			int newIndex = charIndex + key;
			newIndex = newIndex % 26;
			char newChar = (char)('A' + newIndex);
			return newChar;
			
			// Equivalent to:
			// return (char)('A' + (Character.toUpperCase(ch) - 'A' + key) % 26); 
		}
		return ch;
	}
}
