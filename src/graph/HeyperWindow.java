package graph;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.UIManager;

import Heyper.Configuration;
/**
 * Description: This class contains the principal frame.
 * @author Miguel Ángel Cabrera Miñagorri, Sebastiá Guisasola Benítez
 * @version 1.0
 * @since 26 November 2016
 */
public class HeyperWindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the application.
	 */
	public HeyperWindow(Configuration config) {
		setResizable(false);
		setBackground(Color.BLACK);
		setSize(338, 167);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setOpacity((float) 0.80);
		HeyperPanel panel = new HeyperPanel();
		setContentPane(panel);
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

}
