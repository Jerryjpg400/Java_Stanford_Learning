/**************************************************************
 * Compiliation:	javac UseArgument.java
 * Execution:		java UseArgument yourname
 * 
 * Prints "Hi, Bob How are you?" wher "Bob" is 
 * replaced by the command-line argument.
 *
 * % java UseArgument Bob
 * Hi, Bob How are you?
 *
 * % java UseArgument Alice
 * Hi, Alice How are you?
**************************************************************/


public class UseArgument {
	
	public static void main(String[] args) {
		System.out.println("Hi, " + args[0] + " How are you?");
	}
}
