import java.awt.*;
import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import stanford.cs106.util.RandomGenerator;

import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	
	public void run() {
		BankAccount save = new BankAccount("Jimmy");
		save.deposit(10.00);
		save.deposit(50.00);
		save.deposit(10.00);
		save.deposit(70.00);
		println(save.transactionFee(5.00));
		println(save.transactionFee(10.00));
	}
} 