package main.java.teht_03.komponentit.tehtaat;
import main.java.teht_03.komponentit.*;

public abstract class KokoonpanoTehdas {
	
	public abstract Komponentti haeKokoonpano();
	
	/*
	 * Kokoonpanoon rakennetaan koko systeem:
	 * Koppa, jonka sisälle virtalähde, sekä emolevy ja 
	 * emolevyyn kuuluu kaikki muut
	 */
	private Komponentti kokoonpano = null;
	
	public void listaaKokoonpano() {
		komponentit();
		/*
		 * Listataan komponentit
		 */
		kokoonpano.listaaKomponentit();
		/*
		 * Ilmoitetaan kokoonpanon loppusumma
		 */
		System.out.println("Kokoonpanon hinta: "+kokoonpano.getHinta()+"€");
	}
	
	public double getKokoonpanonHinta() {
		return kokoonpano.getHinta();
	}
	
	private void komponentit() {
		/*
		 * Jos kokoonpanoa ei ole vielä määritetty, 
		 * rakennetaan se
		 */
		if(kokoonpano == null) {
			kokoonpano = haeKokoonpano();
		}
	}

}
