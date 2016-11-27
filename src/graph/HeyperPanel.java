package graph;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;


/**
 * Description: This class contains the principal frame.
 * @author Miguel Ángel Cabrera Miñagorri, Sebastiá Guisasola Benítez
 * @version 1.0
 * @since 26 November 2016
 */
public class HeyperPanel extends Container{
	
	private static final long serialVersionUID = 1L;

	
	/**
	 * Description: Constructor de la clase 
	 */
	public HeyperPanel() {
		/*boton para acceder a los ajustes*/
		JButton setting = new JButton();
		setting.setEnabled(false);
		setting.setBorder(null);
		setting.setBackground(UIManager.getColor("Slider.tickColor"));
		setting.setBounds(287, 8, 39, 44);
		setting.setIcon(new ImageIcon(HeyperWindow.class.getResource("/graph/res/images/ajustes.png")));
		add(setting);
		/*boton para añadir funciones*/
		JButton addfunbutton = new JButton();
		addfunbutton.setBackground(UIManager.getColor("Slider.tickColor"));
		addfunbutton.setForeground(UIManager.getColor("Slider.tickColor"));
		addfunbutton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		addfunbutton.setIcon(new ImageIcon(HeyperWindow.class.getResource("/graph/res/images/addoption1.png")));
		addfunbutton.setBounds(245, 12, 34, 34);	
		add(addfunbutton);
		/*boton para salir del programa*/	
		JButton exit = new JButton();
		exit.setBackground(UIManager.getColor("Slider.tickColor"));
		exit.setForeground(UIManager.getColor("Slider.tickColor"));
		exit.setBorder(null);
		exit.setIcon(new ImageIcon(HeyperWindow.class.getResource("/graph/res/images/exit.png")));
		exit.setBounds(297, 125, 20, 20);	
		add(exit);
		/*Aparecen los comandos escritos en la terminal*/
		JLabel label = new JLabel();
		label.setFont(label.getFont().deriveFont(label.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		label.setForeground(new Color(192, 192, 192));
		label.setBackground(new Color(192, 192, 192));
		label.setOpaque(true);
		label.setBounds(47, 73, 243, 34);
		add(label);
		/*Logo del programa*/
		JLabel lblHeyper = new JLabel("HEYPER");
		lblHeyper.setForeground(new Color(138, 43, 226));
		lblHeyper.setBackground(UIManager.getColor("Slider.tickColor"));
		lblHeyper.setFont(new Font("Dialog", Font.BOLD, 19));
		lblHeyper.setBounds(12, 12, 97, 34);
		add(lblHeyper);
		
	}
}
