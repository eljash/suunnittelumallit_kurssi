package main.java.teht_03;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import main.java.teht_03.komponentit.tehtaat.KokoonpanoTehdas;

public class HaeOminaisuuksista {
	public static KokoonpanoTehdas haeAsus() {
		KokoonpanoTehdas tehdas;
		Properties properties = new Properties();
				
				/*
				 * Ladataan "tehdas.properties" tiedosto properties muuttujaan
				 */
				  try {
				    properties.load(
				          new FileInputStream("src/main/java/teht_03/komponentit/tehtaat/tehdas.properties"));
				  } catch (IOException e) {e.printStackTrace();}
				  try{
				    /*
				     * Luetaan tiedostosta Adidas tehdas
				     */
					Class c = Class.forName(properties.getProperty("asus"));
				    tehdas = (KokoonpanoTehdas)c.getDeclaredConstructor().newInstance();
				    
				    /*
				     * Jos tehdas löytyy, palautetaan se
				     */
				    return tehdas;
				  } catch (Exception e){e.printStackTrace();}
				  
				  /*
				   * Palauttaa null jos ominaisuuksista ei löydy vastaavaa tehdasta
				   */
				  return null;
	}
	
	public static KokoonpanoTehdas haeApple() {
		KokoonpanoTehdas tehdas;
		Properties properties = new Properties();
				
				/*
				 * Ladataan "tehdas.properties" tiedosto properties muuttujaan
				 */
				  try {
				    properties.load(
				          new FileInputStream("src/main/java/teht_03/komponentit/tehtaat/tehdas.properties"));
				  } catch (IOException e) {e.printStackTrace();}
				  try{
				    /*
				     * Luetaan tiedostosta Adidas tehdas
				     */
				    Class c = Class.forName(properties.getProperty("apple"));
				    tehdas = (KokoonpanoTehdas)c.getDeclaredConstructor().newInstance();
				    
				    /*
				     * Jos tehdas löytyy, palautetaan se
				     */
				    return tehdas;
				  } catch (Exception e){e.printStackTrace();}
				  
				  /*
				   * Palauttaa null jos ominaisuuksista ei löydy vastaavaa tehdasta
				   */
				  return null;
	}
	
}
