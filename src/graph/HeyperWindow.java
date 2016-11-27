package graph;
import java.awt.Color;
import javax.swing.JFrame;
import main.Configuration;


/**
 * Description: This class contains the principal frame.
 * @author Miguel Ángel Cabrera Miñagorri, Sebastiá Guisasola Benítez
 * @version 1.0
 * @since 26 November 2016
 */
public class HeyperWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;

	/**
	 * Description: Constructor of the frame.
	 * @params config of type Configuration. 
	 */
	public HeyperWindow(Configuration config){
		setResizable(false);
		setBackground(Color.BLACK);
		setSize(338,167);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setOpacity((float) 0.80);
		HeyperPanel panel = new HeyperPanel();
		setPane(panel);
			
	}
	/**
	* Description: set a new panel
	*/
	public void setPane(HeyperPanel panel){
		setContentPane(panel);
	}

}
