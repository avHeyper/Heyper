package main;

import graph.Wizard;


public class Setup {
	
	public static Boolean installed = false;
	
	public Setup() {
		
		Setup.installed = true;
		initialize();
	}
	
	// Initiate the configuration process.
	public void initialize(){
		Wizard wizWin = new Wizard();
		wizWin.setVisible(true);
	}
		
		
		
}
