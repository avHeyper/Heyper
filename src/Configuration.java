
public class Configuration {

	private Boolean ini;
	private	String name;
	private String lang;
	
	public Configuration() {
		ini = true;
		name = "Heyper";
		lang = "Español";
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
			
			
}
