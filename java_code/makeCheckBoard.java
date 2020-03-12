import java.awt.*;
import acm.program.*;
import acm.graphics.*;

public class makeCheckboard extends GraphicsProgram{
	public void run () {
		checkboard();
	}
	
	private void checkboard () {
		int column = 8;
		int row = 8;
		int square_size = 50;
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				int x = c * square_size;
				int y = r * square_size;
				GRect square = new GRect(x, y, square_size, square_size);
				square.setFilled((r + c) % 2 == 0);
				add(square);
			}
		}
	}
}
