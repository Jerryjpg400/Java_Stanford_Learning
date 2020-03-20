import acm.program.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class BlankProgram extends Program{
	public void init() {
		JButton button1 = new JButton("Botton1");
		add(button1, NORTH);
		JButton button2 = new JButton("Button2");
		add(button2, SOUTH);
		JLabel label = new JLabel("Hello world!");
		add(label, CENTER);
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent event) {
		if (event.getActionCommand().equals("Calculate tips!")) {
			String subtotal = subtotalField.getText();
		}
	}
}
