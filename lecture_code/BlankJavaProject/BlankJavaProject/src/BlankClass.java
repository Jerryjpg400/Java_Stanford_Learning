import java.awt.*;
import acm.program.ConsoleProgram;
import java.applet.*;

public class BlankClass extends ConsoleProgram{
	public void run() {
		int[] num = new int[8];
		for (int i = 0; i < num.length; i++) {
			num[i] = 2*i;
			println(num[i]);
		}
	}
}