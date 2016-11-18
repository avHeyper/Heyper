package graph;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Wizard extends JFrame{
	/**
	 * Create the setup window.
	 */
	public Wizard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
