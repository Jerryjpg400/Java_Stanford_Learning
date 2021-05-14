/**************************************************************
 * Compilation:		javac TenHelloWorlds.java
 * Execution:		java TenHelloWorlds
 *
 * Print 10 times "Hello, World"
**************************************************************/

public class TenHelloWorlds {
	
	public static void main(String[] args) {
		int i = 10;

		// Prints 10's "Hello, World"
		while(i > 0) {
			System.out.println(i + " Hello, World");
			i--;
		}
	}
}
