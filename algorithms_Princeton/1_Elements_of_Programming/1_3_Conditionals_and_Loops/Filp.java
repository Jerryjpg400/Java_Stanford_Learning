/******************************************************************************
 *  Compilation:  javac Flip.java
 *  Execution:    java Flip
 *  
 *  Simulate a fair coin flip and print out "Heads" or "Tails" accordingly.
 *
 *  % java Flip
 *  Heads
 *
 *  % java Flip
 *  Heads
 *
 *  % java Flip
 *  Tails
 *
 *
 *****************************************************************************/

 public class Filp {
	
	public static void main(String[] args) {
		if (Math.random() < 0.5) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}
	}
 }
