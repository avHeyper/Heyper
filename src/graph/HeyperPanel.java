package graph;

import java.awt.Container;
import graph.HeyperWindow;
import graph.ConfPanel;
import graph.AddPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;





/**
 * Description: This class contains the principal frame.
 * @author Miguel Ángel Cabrera Miñagorri, Sebastiá Guisasola Benítez
 * @version 1.0
 * @since 26 November 2016
 */
public class HeyperPanel extends Container implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JButton setting;
	private JButton addfunbutton;
	private JButton exit;
	private JLabel label;
	private JLabel lblHeyper;
	private HeyperWindow heyperwindow;
	
	/**
	 * Description: Constructor de la clase, se crea el panel asociado al main
	 */
	public HeyperPanel(HeyperWindow heyperwindow){
		
		this.heyperwindow = heyperwindow;/*obtenemos el frame que usa este container*/
		
		/*boton para acceder a los ajustes*/
		setting = new JButton();
		//setting.setEnabled(false);
		setting.setBorder(null);
		setting.setBackground(UIManager.getColor("Slider.tickColor"));
		setting.setBounds(150,110, 35, 35);
		setting.setIcon(new ImageIcon(HeyperWindow.class.getResource("/graph/res/images/ajustes2.png")));
		setting.addActionListener(this);
		add(setting);
		
		/*boton para añadir funciones*/
		addfunbutton = new JButton();
		addfunbutton.setBackground(UIManager.getColor("Slider.tickColor"));
		addfunbutton.setBorder(null);
		addfunbutton.setIcon(new ImageIcon(HeyperWindow.class.getResource("/graph/res/images/addoption2.png")));
		addfunbutton.setBounds(270, 7, 22, 23);	
		addfunbutton.addActionListener(this);
		add(addfunbutton);
		
		/*boton para salir del programa*/	
		exit = new JButton();
		exit.setBackground(UIManager.getColor("Slider.tickColor"));
		exit.setBorder(null);
		exit.setIcon(new ImageIcon(HeyperWindow.class.getResource("/graph/res/images/exit.png")));
		exit.setBounds(307, 8, 20, 20);	
		exit.addActionListener(this);
		add(exit);
		
		/*Aparecen los comandos escritos en la terminal*/
		label = new JLabel();
		label.setFont(label.getFont().deriveFont(label.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		label.setForeground(new Color(192, 192, 192));
		label.setBackground(new Color(192, 192, 192));
		label.setOpaque(true);
		label.setBounds(47, 73, 243, 34);
		add(label);
		
		/*Logo del programa*/
		lblHeyper = new JLabel("HEYPER");
		lblHeyper.setForeground(new Color(0, 204, 240));
		lblHeyper.setBackground(UIManager.getColor("Slider.tickColor"));
		lblHeyper.setFont(new Font("Dialog", Font.BOLD, 19));
		lblHeyper.setBounds(12, 12, 97, 34);
		add(lblHeyper);
		
	}
	/**
	 * Descripcion: Escucha de los botones para realizar acciones
	 * @params e de tipo ActionEvent 
	 */
	public void actionPerformed(ActionEvent e) {
		Object push = e.getSource();/*Obtenemos objeto pulsado y actuamos en funcion de el*/
		if (push==exit) {
            System.exit(0);
        }
		if (push==addfunbutton){
			AddPanel addpanel = new AddPanel();
			
			
		}
		if (push==setting){
			/*pasamos el frame principal y este container al container de configuracion para que pueda volver a el al acabar*/
			ConfPanel confpanel = new ConfPanel(heyperwindow, this);
			heyperwindow.setContentPane(confpanel);
			heyperwindow.setVisible(true);
		}
        
		
    }
}
