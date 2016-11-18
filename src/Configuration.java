/**
 * Main configuration for the assistant.
 * 
 * @author Sebastia Guisasola Benitez, Miguel Angel Cabrera Miñagorri
 * @version 1.0
 * @since November 2016
 */
public class Configuration {
	// Configuration parameters. 
	private Boolean ini;
	private	String name;
	private String lang;
	private String user;
	
	public Configuration(Boolean ini, String name, String lang, String user) {
		
		this.ini = ini;
		this.name = name;
		this.lang = lang;
		this.user = user;
	}
	
	// Initiation getter.
	public Boolean getIni() {
		return ini;
	}
	// Initiation setter.
	public void setIni(Boolean ini) {
		this.ini = ini;
	}
	// Assistant name getter.
	public String getName() {
		return name;
	}
	// Assistant name setter.
	public void setName(String name) {
		this.name = name;
	}
	// Language getter.
	public String getLang() {
		return lang;
	}
	// Language setter.
	public void setLang(String lang) {
		this.lang = lang;
	}
	// User getter.
	public String getUser() {
		return user;
	}
	// User setter.
	public void setUser(String user) {
		this.user = user;
	}
			
			
}

