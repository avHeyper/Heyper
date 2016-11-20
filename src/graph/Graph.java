package graph;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.JPanel;

/**
 * Description: This class contains the principal frame.
 * @author Miguel Ángel Cabrera Miñagorri, Sebastiá Guisasola Benítez
 * @version 1.0
 * @since 20 November 2016
 */
public class Graph {

	private JFrame frame;

	/*
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graph window = new Graph();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 	*/
	/**
	 * Description: Initialize the principal frame.
	 * 
	 */
	public Graph() {
		initialize();
	}

	/**
	 * Description :Initialize the contents of the frame.
	 */
	private void initialize() {
		/*creacion del frame*/
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("UnPilgi", Font.PLAIN, 12));
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setForeground(new Color(255, 20, 147));
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setBackground(UIManager.getColor("Slider.tickColor"));
		frame.setSize(338, 167);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setOpacity((float) 0.80);
		/*boton de ajustes*/
		JButton setting = new JButton("");
		setting.setEnabled(false);
		setting.setBorder(null);
		setting.setBackground(UIManager.getColor("Slider.tickColor"));
		setting.setBounds(287, 8, 39, 44);
		setting.setIcon(new ImageIcon(Graph.class.getResource("/graph/res/images/ajustes.png")));
		frame.getContentPane().add(setting);
		/*boton para añadir funciones*/
		JButton addfunbutton = new JButton("");
		addfunbutton.setBackground(UIManager.getColor("Slider.tickColor"));
		addfunbutton.setForeground(UIManager.getColor("Slider.tickColor"));
		addfunbutton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		addfunbutton.setIcon(new ImageIcon(Graph.class.getResource("/graph/res/images/addoption1.png")));
		addfunbutton.setBounds(245, 12, 34, 34);	
		frame.getContentPane().add(addfunbutton);
		/*label donde se mostraran los comandos asociados*/
		JLabel label = new JLabel("Comandos --opciones");
		label.setFont(label.getFont().deriveFont(label.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		label.setForeground(new Color(192, 192, 192));
		label.setBackground(new Color(192, 192, 192));
		label.setOpaque(true);
		label.setBounds(47, 73, 243, 34);
		frame.getContentPane().add(label);
		/*label provisional que se sustituira por el logo*/
		JLabel lblHeyper = new JLabel("HEYPER");
		lblHeyper.setForeground(new Color(138, 43, 226));
		lblHeyper.setBackground(UIManager.getColor("Slider.tickColor"));
		lblHeyper.setFont(new Font("Dialog", Font.BOLD, 19));
		lblHeyper.setBounds(12, 12, 97, 34);
		frame.getContentPane().add(lblHeyper);
		
		
		
	}
}
