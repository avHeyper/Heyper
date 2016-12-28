package main;

import java.io.IOException;
import java.util.*;
/**
 * Description: Contains the command map and the method for make the order.
 * @author Miguel Ángel Cabrera Miñagorri, Sebastiá Guisasola Benítez
 * @version 1.0
 * @since 28 December 2016
 */
public class Command {
	// Map which contains the command list
	private Map<String,String> commands;
	private String comando;
	private String instruction = "";
	
	public Command(String recog){
		this.setMap(); // Initialize the command map
		// Separate the command from the specific instruction
		String[] arrayString = recog.split(" ");
		for(int i = 1 ; i < arrayString.length ; i++)
			this.instruction += arrayString[i] + " ";
		// Check if the instruction is contained in the map
		if ((this.comando = commands.get(arrayString[0])) == null)
			System.out.println("El comando introducido no es valido");		
	}
	
	/**
	 * Description: Send the instruction to the system
	 */
	public void makeOrder(){
		// Array for the full instruction
		String[] terminal = new String[2];
		terminal[0] = comando;
		terminal[1] = instruction;
		try {
			Runtime.getRuntime().exec(terminal);
		} catch (IOException e) {
			System.out.println("Error al ejecutar la orden");
		}
	}
	
	
	/**
	 * @return comando
	 */
	public String getComando(){
		return comando;
	}
	
	public void setComando(String ins){
		this.comando = ins;
	}
	
	/**
	 * Description: Initialize the command map
	 */
	public void setMap(){
		commands = new HashMap<String,String>();
		commands.put("buscar", "firefox");
		commands.put("listar", "ls");
		commands.put("mostrar", "ls");
		commands.put("copiar", "cp");
		commands.put("mover", "mv");
		commands.put("cerrar", "kill");
	}
}
