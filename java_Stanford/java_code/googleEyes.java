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
	public void run () {
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent event) {
		setCanvasSize(350, 250);
		setBackground(Color.CYAN);
		
		GOval circle = new GOval(70, 65, 100 ,100);
		circle.setFilled(true);
		circle.setFillColor(Color.WHITE);
		add(circle);
		
		GOval circle2 = new GOval(170, 65, 100 ,100);
		circle2.setFilled(true);
		circle2.setFillColor(Color.WHITE);
		add(circle2);
		
		GOval smallBlack = new GOval(110, 65, 20, 20);
		smallBlack.setFilled(true);
		add(smallBlack);
		
		GOval smallBlack2 = new GOval(210, 65, 20, 20);
		smallBlack2.setFilled(true);
		add(smallBlack2);
		
		double x = event.getX();
		double y = event.getY();
		
		if (y >= 65 && y <= 165) {
			smallBlack.setLocation(110, 105);
			smallBlack2.setLocation(210, 105);
		} else if (y > 165) {
			smallBlack.setLocation(110, 145);
			smallBlack2.setLocation(210, 145);
		} else {
			smallBlack.setLocation(110, 65);
			smallBlack2.setLocation(210, 65);
		}
	}

}