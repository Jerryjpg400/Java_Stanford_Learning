/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you
 * change the class name, you'll need to change the filename so that it matches.
 */
import java.awt.*;
import acm.graphics.*;
import acm.program.*;
import stanford.cs106.util.RandomGenerator;
import java.io.*;
import java.util.*;
import javax.naming.NameAlreadyBoundException;
import java.awt.event.*;

public class GraphicExample1 extends GraphicsProgram {
	private static final int RAINDROP_SIZE = 10;
	
	public void run () {
		
		raindrop();
	}
	
	private void raindrop() {
		randomRainDrop();
		int elaspsedTime = 0;
		while (true) {
			for (GObject rain : this) {
				rain.move(0, 2);
			}
			pause(50);
			elaspsedTime += 50;
			if (elaspsedTime % 500 == 0) {
				randomRainDrop();
				setBackground(RandomGenerator.getInstance().nextColor());
			}
		}
	}
	private void randomRainDrop() {
		double x = RandomGenerator.getInstance().nextDouble(0, getWidth());
		makeRain(x, 0);
	}
	
	private void makeRain(double x, int y) {
		GOval raindrop = new GOval(x, y, RAINDROP_SIZE, RAINDROP_SIZE);
		raindrop.setFilled(true);
		raindrop.setFillColor(RandomGenerator.getInstance().nextColor());
		add(raindrop);
	}
	
	public void mouseClicked(MouseEvent event) {
		makeRain(event.getX(), event.getY());
	} 
	
	
	
	
}