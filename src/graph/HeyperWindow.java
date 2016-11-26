package graph;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.UIManager;
import graph.HeyperPanel;
/**
 * Description: This class contains the principal frame.
 * @author Miguel Ángel Cabrera Miñagorri, Sebastiá Guisasola Benítez
 * @version 1.0
 * @since 26 November 2016
 */
public class HeyperWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeyperWindow window = new HeyperWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HeyperWindow() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBackground(Color.BLACK);
		frame.setSize(338, 167);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setOpacity((float) 0.80);
		frame.setContentPane(new HeyperPanel.getContainer());
		/*frame.getContentPane().setFont(new Font("UnPilgi", Font.PLAIN, 12));
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setForeground(new Color(255, 20, 147));
		frame.getContentPane().setBackground(UIManager.getColor("Slider.tickColor"));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(HeyperPanel.setting);
		frame.getContentPane().add(HeyperPanel.addfunbutton);
		frame.getContentPane().add(HeyperPanel.label);
		frame.getContentPane().add(HeyperPanel.lblHeyper);
		frame.getContentPane().add(HeyperPanel.exit);*/
		
		
}
