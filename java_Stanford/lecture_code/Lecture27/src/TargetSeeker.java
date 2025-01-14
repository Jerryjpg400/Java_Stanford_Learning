/*
 * File: TargetSeeker.java
 * -----------------------
 * This program simulates a seeker moving toward a target.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

public class TargetSeeker extends GraphicsProgram {
	
	/* Constants */
	private static final int TARGET_SIZE = 10;
	private static final int SEEKER_SIZE = 20;
	private static final int PAUSE_TIME = 10;
	
	/* Private instance variables */
	private int targetMidX;
	private int targetMidY;
	private GRect targetSquare;
	private GRect seeker;

	public void run() {
		initTarget();
		initSeeker();
		
		// Always keep seeking the target
		while (true) {
			seek();
			pause(PAUSE_TIME);
		}
	}
	
	// Target is filled red square that starts in center 
	// of screen
	private void initTarget() {
		targetSquare = new GRect(TARGET_SIZE, TARGET_SIZE);
		targetSquare.setColor(Color.RED);
		targetSquare.setFilled(true);
		targetMidX = getWidth() / 2;
		targetMidY = getHeight() / 2;
		add(targetSquare, 
			targetMidX - TARGET_SIZE/2, targetMidY - TARGET_SIZE/2);
	}
	
	// Seeker is unfilled black square that starts at origin
	private void initSeeker() {
		seeker = new GRect(SEEKER_SIZE, SEEKER_SIZE);
		add(seeker, 0, 0);
	}
	
	// Determine direction for seeker to move to get
	// closer to targetPos
	private int moveAmount(double seekerPos, double targetPos) {
		int amount = 0;
		if (targetPos > seekerPos) {
			amount = 1;
		} else if (targetPos < seekerPos) {
			amount = -1;
		}
		return amount;
	}
	
	// Seek target by taking a step toward its direction
	private void seek() {
		// See if target is to left or right
		double seekerMidX = seeker.getX() + SEEKER_SIZE / 2;
		int dx = moveAmount(seekerMidX, targetMidX);
		
		// See if target is above or below
		double seekerMidY = seeker.getY() + SEEKER_SIZE / 2;
		int dy = moveAmount(seekerMidY, targetMidY);

		// move seeker toward target
		seeker.move(dx, dy);
	}
	
	// move center of target to position of mouse click
	public void mouseClicked(MouseEvent e) {
		targetMidX = e.getX();
		targetMidY = e.getY();
		targetSquare.setLocation(targetMidX - TARGET_SIZE / 2,
								 targetMidY - TARGET_SIZE / 2);
	}
}

