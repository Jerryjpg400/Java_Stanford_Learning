/* File: Shrink.java
 * -------------------
 * This program shows how we can use 2D arrays and GImages
 * to modify an image's pixels to make it 1/2 size.
 * -------------------
 */

import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class Shrink extends GraphicsProgram {
	public void run() {	
		GImage image = new GImage("res/daisy.jpg");
		setCanvasSize(image.getWidth(), image.getHeight());
		add(image);

		int[][] pixels = image.getPixelArray();
		int[][] result = new int[pixels.length / 2][pixels[0].length / 2];

		for (int r = 0; r < result.length; r++) {
			for (int c = 0; c < result[0].length; c++) {
				result[r][c] = pixels[r*2][c*2];
			}
		}
		pause(1000);
		image.setPixelArray(result);
	}
}
