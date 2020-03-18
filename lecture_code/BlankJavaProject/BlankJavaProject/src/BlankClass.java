import java.awt.*;
import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import stanford.cs106.util.RandomGenerator;

import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	
	public void run() {
		Date dt = new Date(12, 30);
		println("daysInMonth : " + dt.daysInMonth());
		println("getDay : " + dt.getDay());
		println("getMonth : " + dt.getMonth());
		dt.nextDay();
		println("date1 : day :" + dt.getDay() + " month : " + dt.getMonth());
		dt.nextDay();
		println("date1 : day :" + dt.getDay() + " month : " + dt.getMonth());
		dt.nextDay();
		println("date1 : day :" + dt.getDay() + " month : " + dt.getMonth());
		dt.nextDay();
		println("date1 : day :" + dt.getDay() + " month : " + dt.getMonth());
		for (int i = 0; i < 13*30; i++) {
			dt.nextDay();
			println("date1 : day :" + dt.getDay() + " month : " + dt.getMonth());
			println("date is : " + dt);
		}
	}
} 