package main;

import graph.HeyperWindow;

/**
 * Main process. 
 * 
 * @author Sebastia Guisasola Benitez, Miguel Angel Cabrera Miñagorri
 * @version 1.0
 * @since November 2016
 */
public class Heyper {

	public static void main(String[] args) {
	    // Configuration settings
	    Configuration config = null;
	    config = new Configuration("res/config.txt");
	    
	    // Open Heyper window
		HeyperWindow mainProcess = new HeyperWindow(config);
		mainProcess.setVisible(true);
	}

}
