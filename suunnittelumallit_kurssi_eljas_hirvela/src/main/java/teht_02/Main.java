package main.java.teht_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		/*
		 * Alustukset
		 */
		Koodaaja jasper = null;
		Class c = null;
		UlkoasuTehdas tehdas = null;
		Properties properties = new Properties();
		
		/*
		 * Ladataan "tehdas.properties" tiedosto properties muuttujaan
		 */
		  try {
		    properties.load(
		          new FileInputStream("src/main/java/teht_02/tehdas.properties"));
		  } catch (IOException e) {e.printStackTrace();}
		  try{
		    /*
		     * Luetaan tiedostosta Adidas tehdas
		     */
		    c = Class.forName(properties.getProperty("adidas"));
		    tehdas = (UlkoasuTehdas)c.getDeclaredConstructor().newInstance();
		    
		    /*
		     * Annetaan Jasperille Adidas tehdas
		     */
		    jasper = new Jasper(tehdas);
		    
		    /*
			 * Käsketään Jasperia kertomaan ulkoasustaan
			 */
			jasper.kerroUlkoasusta();
			
			/*
		     * Luetaan tiedostosta Boss tehdas
		     */
		    c = Class.forName(properties.getProperty("boss"));
		    tehdas = (UlkoasuTehdas)c.getDeclaredConstructor().newInstance();
		    
		    /*
		     * Annetaan Jasperille Boss tehdas
		     */
		    jasper = new Jasper(tehdas);
		    
		    /*
			 * Käsketään Jasperia kertomaan taas ulkoasustaan
			 */
			jasper.kerroUlkoasusta();
		  } catch (Exception e){e.printStackTrace();}
	}

}
