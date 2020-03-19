/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you
 * change the class name, you'll need to change the filename so that it matches.
 */
import java.awt.*;
import acm.graphics.*;
import acm.program.*;
import java.io.*;
import java.util.*;
import javax.naming.NameAlreadyBoundException;

public class GraphicExample1 extends GraphicsProgram {
	public void run() {
		drawTrafficLight(50, 50, 100);
		drawTrafficLight(200, 50, 100);
		drawTrafficLight(400, 300, 150);
	}
	private void drawTrafficLight(int x, int y, int diameter) {
		GCompound TrafficLight = new GCompound();
		// draw a light box
		GRect square = new GRect(x, y, diameter, diameter+2*diameter);
		square.setFilled(true);
		square.setColor(Color.GRAY);
		TrafficLight.add(square);
		// draw a red light
		GOval RED_cycle = new GOval(x, y, diameter, diameter);
		RED_cycle.setFilled(true);
		RED_cycle.setColor(Color.RED);
		TrafficLight.add(RED_cycle);
		// draw a yellow light
		GOval YELLOW_cycle = new GOval(x, y+diameter, diameter, diameter);
		YELLOW_cycle.setFilled(true);
		YELLOW_cycle.setColor(Color.YELLOW);
		TrafficLight.add(YELLOW_cycle);
		// draw a green light
		GOval GREEN_cycle = new GOval(x, y+2*diameter, diameter, diameter);
		GREEN_cycle.setFilled(true);
		GREEN_cycle.setColor(Color.GREEN);
		TrafficLight.add(GREEN_cycle);
		// draw whole traffic light 
		add(TrafficLight);
	}
}