package Heyper;

import java.io.*;
/**
 * Main configuration for the assistant.
 * 
 * @author Sebastia Guisasola Benitez, Miguel Angel Cabrera Miñagorri
 * @version 1.0
 * @since November 2016
 */


public class Configuration{
	// Parameters configuration. 
	private String name;
	private String lang;
	private String user;
	private String configURL;
	
	public Configuration(String configURL) {
		this.configURL = configURL;
		FileReader configR = null;
		BufferedReader configBR = null;
		try {
			configR = new FileReader(configURL);
			configBR = new BufferedReader(configR);
			this.name = configBR.readLine();
			this.lang = configBR.readLine();
			this.user = configBR.readLine();
			configBR.close();
		}catch(IOException msg){
			msg.getStackTrace();
		}finally{
			try {
				configR.close();
			}catch(IOException e){
				e.getStackTrace();
			}
		}
	}
	// Set a new configuration.
	public void setConfiguration(String newConf[]){
	    FileWriter configW = null;
	    PrintWriter configPW = null;
	    // Set new parameters
	    this.name = newConf[0];
	    this.lang = newConf[1];
	    this.user = newConf[2];
	    try {
	        configW = new FileWriter(configURL);
	        configPW = new PrintWriter(configW);
	        configPW.flush();
	        for(int x = 0; x < newConf.length; x++){
	            configPW.write(newConf[x]);
	            configPW.println();
	         }
	        configPW.close();
	    } catch (IOException e) {
	        e.getStackTrace();
	    } finally {
	        if(configW != null){
	            try {
	                configW.close();
	            } catch (IOException e) {
	            	e.getStackTrace();
	            }
	        }
	    }
	}
	// Assistant name getter.
	public String getName() {
		return name;
	}
	// Assistant name setter.
	public void setName(String name) throws IOException{
		this.name = name;
	}
	// Language getter.
	public String getLang() {
		return lang;
	}
	// Language setter.
	public void setLang(String lang) throws IOException{
		this.lang = lang;
	}
	// User getter.
	public String getUser() {
		return user;
	}
	// User setter.
	public void setUser(String user) throws IOException{
		this.user = user;
	}
			
			
}
