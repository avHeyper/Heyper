package graph;

import java.awt.EventQueue;

import javax.swing.JFrame;
/**
* Description: Graphic interface of the instalation process
* @author Miguel Ángel Cabrera Miñagorri, Sebastiá Guisasola Benítez
* @version 1.0
* @since 18 November 2016
*/
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
		setSize(450, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
