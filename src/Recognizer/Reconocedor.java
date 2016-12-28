package Recognizer;

import java.io.IOException;

import javax.swing.JOptionPane;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import graph.HeyperPanel;

/**
 * Description: This class contains the recognizer.
 * @author Miguel Ángel Cabrera Miñagorri, Sebastiá Guisasola Benítez
 * @version 1.0
 * @since 23 December 2016
 */

public class Reconocedor {
	
	private Configuration conf;
	private LiveSpeechRecognizer recognizer;
	private SpeechResult result;
	private String entendido;
	
	/** 
	 * Description: Constructor. Call the methods for recognize.
	 */
	
	public Reconocedor(){
		conffiles();	
	}
	
	/**
	 * Description: Sets the path of files needed for sphinx.
	 */
	
	private void conffiles(){
		//Configuramos los archivos necesarios para el reconocimiento.
		conf = new Configuration();
		conf.setAcousticModelPath("res/mod-es");
		conf.setDictionaryPath("res/es.dict");
		conf.setLanguageModelPath("res/es-20k.lm");
		conf.setGrammarPath("res/grammar.jsgf");
		//Establecemos la configuracion en el reconocedor.
		try{
		recognizer = new LiveSpeechRecognizer(conf);
		}catch(IOException e){
			System.out.println("Error");
		}
	}
	
	/**
	 * Description: Initialice the recognition.
	 */
	
	public void recognition(){		
		recognizer.startRecognition(true);
		JOptionPane.showMessageDialog(null, "Pulse 'ok' y comience a hablar");
		result = recognizer.getResult();
		recognizer.stopRecognition();
		JOptionPane.showMessageDialog(null, "Entendido, gracias \n (Pulse ok para continuar)");
		entendido = result.getHypothesis();
		System.out.println(entendido);
	}
	
	/**
	 * Description: return a String with recognized audio.
	 * @return  String with the recognized audio
	 */
	
	public String getRecord(){
		return entendido;
	}
}
