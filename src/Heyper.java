/**
 * Main process. 
 * 
 * @author Sebastia Guisasola Benitez, Miguel Angel Cabrera Miñagorri
 * @version 1.0
 * @since November 2016
 */
public class Heyper {

	public static void main(String[] args) {
		Configuration config;
		// Check if the program has been already installed.
		if (Setup.installed == false){
			
			Setup install = new Setup();
			install.initiate();
		}

	}

}
