package graph;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import main.Configuration;

/**
 * Description: This class contains the principal frame.
 * @author Miguel Ángel Cabrera Miñagorri, Sebastiá Guisasola Benítez
 * @version 1.0
 * @since 2 December 2016
 */
public class ConfPanel extends Container implements ActionListener {

	private static final long serialVersionUID = 2L;
	private JTextField name;
	private JTextField lang;
	//private Checkbox langing;
	//private Checkbox langesp;
	private JTextField user;
	private JButton btnexit;
	private HeyperWindow heyperwindow;
	private Container heyperpanel;
	private JButton accept;
	private Configuration conf;

	/**
	 * Descripcion: Constructor de la clase, Crea el panel asociado a los ajustes  
	 */
	public ConfPanel(HeyperWindow heyperwindow, Container heyperpanel) {
		
		/*obtenemos el frame y container principales*/
		this.heyperwindow = heyperwindow;
		this.heyperpanel = heyperpanel;
		
		/*boton para salir de la configuracion*/
		btnexit = new JButton();
		btnexit.setBackground(UIManager.getColor("Slider.tickColor"));
		btnexit.setBorder(null);
		btnexit.setIcon(new ImageIcon(HeyperWindow.class.getResource("/graph/res/images/exit.png")));
		btnexit.setBounds(307, 8, 20, 20);	
		btnexit.addActionListener(this);
		add(btnexit);
		
		/*boton para aceptar el formulario*/
		accept = new JButton("Accept");
		accept.setBackground(UIManager.getColor("Slider.tickColor"));
		accept.setForeground(new Color(0, 204, 240));
		accept.setBorder(null);
		//accept.setIcon(new ImageIcon(HeyperWindow.class.getResource("/graph/res/images/exit.png")));
		accept.setBounds(160, 134, 60, 20);	
		accept.addActionListener(this);
		add(accept);
		
		/*configura el nombre del asistente*/
		name = new JTextField();
		name.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		name.setBounds(140,45, 120, 20);
		name.setForeground(Color.DARK_GRAY);
		name.setBackground(new Color(192, 192, 192));
		name.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		name.addActionListener(this);
		add(name);
		/*configura el lenguaje*/
		/*langesp = new Checkbox("Español");
		langing = new Checkbox("English");
		langesp.setLabel("Español");
		langing.setLabel("Ingles");
		langesp.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		langing.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		langesp.setBounds(140,75,60,20);
		langing.setBounds(210,75,60,20);
		add(langesp);
		add(langing);*/
		lang = new JTextField(); 
		lang.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		lang.setForeground(Color.DARK_GRAY);
		lang.setBackground(new Color(192, 192, 192));
		lang.setBounds(140,75, 120, 20);
		lang.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		lang.addActionListener(this);
		add(lang);
		/*configura el nombre de usuario*/
		user = new JTextField();
		user.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		user.setForeground(Color.DARK_GRAY);
		user.setBackground(new Color(192, 192, 192));
		user.setBounds(140,105, 120, 20);
		user.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		user.addActionListener(this);
		add(user);
		
		/*etiquetas para cada opcion*/
		JLabel lblname = new JLabel("Assistant's name:");
		lblname.setForeground(new Color(0, 204, 240));
		lblname.setBackground(UIManager.getColor("Slider.tickColor"));
		lblname.setFont(new Font("Dialog", Font.BOLD, 10));
		lblname.setBounds(10, 45, 120, 20);
		add(lblname);
		
		JLabel lbllang = new JLabel("Language:");
		lbllang.setForeground(new Color(0, 204, 240));
		lbllang.setBackground(UIManager.getColor("Slider.tickColor"));
		lbllang.setFont(new Font("Dialog", Font.BOLD, 10));
		lbllang.setBounds(10, 75, 80, 20);
		add(lbllang);
		
		JLabel lbluser = new JLabel("Your name:");
		lbluser.setForeground(new Color(0, 204, 240));
		lbluser.setBackground(UIManager.getColor("Slider.tickColor"));
		lbluser.setFont(new Font("Dialog", Font.BOLD, 10));
		lbluser.setBounds(10, 105, 80, 20);
		add(lbluser);
		
		/*ponemos en los campos de texto la configuracion actual*/
		conf = new Configuration("res/config.txt");
		name.setText(conf.getName());
		lang.setText(conf.getLang());
		//de momento como solo vamos a tener ingles y español solo podemos contemplar esos casos siendo ingles por defecto
		/*if (conf.getLang().equals("Español")){
			langesp.setState(true);
			langing.setState(false);
		}else{
			langing.setState(true);
			langesp.setState(false);
		}*/
		user.setText(conf.getUser());
		
			
	}
	
	
	/**
	 * Descripcion: Escucha de los botones para realizar acciones
	 * @params e de tipo ActionEvent 
	 */
	public void actionPerformed(ActionEvent e) {
		/*si pulsamos en salir volvemos al frame principal pasado en el constructor*/
		if (e.getSource()==btnexit) {
            heyperwindow.setContentPane(heyperpanel);   
        }
		if(e.getSource()==accept){
			//llamamos al metodo que confgura el fichero
			fichconf();
		}
	}
	
	/**
	 * Descripcion: Modifica el fichero de configuracion en funcion de los campos ingresados.
	 */
	 public void fichconf(){
		 String	n = name.getText();
		 String	l = lang.getText();
		 /*String l = langesp.getState() ? "Español" : "Ingles";*/
		 String	u = user.getText();
		 String [] str = {n,l,u};
		 conf.setConfiguration(str);
		 
	 }
}
