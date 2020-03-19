import java.awt.*;
import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import stanford.cs106.util.RandomGenerator;

import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	
	public void run() {
		DateClass da = new DateClass(12, 31);
		println("Date is :" + da);
		for (int i = 0; i < 120; i++) {
			da.nextDay();
			println("Date is :" + da);
		}
	}
} 