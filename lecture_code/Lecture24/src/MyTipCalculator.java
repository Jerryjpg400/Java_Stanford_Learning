/* File: MyTipCalculator.java
 * ------------------------
 * This program demonstrates using interactors
 * to let a user calculate a tip for their bill.
 */
import javax.swing.*;
import acm.program.*;
import java.awt.event.*;

public class MyTipCalculator extends ConsoleProgram {
	
	private static final int TEXT_FIELD_WIDTH = 10;
	
	private JTextField textField;

	public void init() {
		JLabel totalLabel = new JLabel("Subtotal: ");
		add(totalLabel, NORTH);
		
		textField = new JTextField(TEXT_FIELD_WIDTH);
		textField.addActionListener(this);
		textField.setActionCommand("20%");
		add(textField, NORTH);
		
		JButton button15 = new JButton("15%");
		add(button15, NORTH);
		JButton button20 = new JButton("20%");
		add(button20, NORTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent event) {
		clearConsole();
		double total = Double.parseDouble(textField.getText());
		
		// Calculates tip
		double tip = 0;
		if (event.getActionCommand().equals("15%")) {
			tip = total * 0.15;
		} else if (event.getActionCommand().equals("20%")) {
			tip = total * 0.2;
		} else {
			println("Unknown command");
		}
		
		println("Total: $" + total);
		println("Tip: $" + tip);
		println("New Total: $" + (total + tip));
	}
}
