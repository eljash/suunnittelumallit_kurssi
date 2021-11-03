package main.java.teht_03.komponentit.tehtaat.apple;

import main.java.teht_03.komponentit.Komponentti;
import main.java.teht_03.komponentit.tehtaat.*;

public class AppleTehdas extends KokoonpanoTehdas {

	@Override
	public Komponentti haeKokoonpano() {
		/*
		 * Rakennetaan Asus tehtaan kokoonpano aloittamalla kopasta
		 */
		Komponentti kokoonpano = new AppleCase();
		
		/*
		 * Luodaan emolevy
		 */
		Komponentti emolevy = new AppleMotherboard();
		
		/*
		 * Lisätään emolevyyn prosessori
		 */
		emolevy.lisaaKomponentti(new AppleCpu());
		
		/*
		 * Lisätään emolevyyn näytönohjain
		 */
		emolevy.lisaaKomponentti(new AppleGpu());
		
		/*
		 * Lisätään emolevyyn kaksi välimuisti kampaa
		 */
		emolevy.lisaaKomponentti(new AppleRam());
		emolevy.lisaaKomponentti(new AppleRam());
		
		/*
		 * Lisätään verkkokortti emolevyyn
		 */
		emolevy.lisaaKomponentti(new AppleNetworkingCard());
		
		/*
		 * Lisätään emolevy kopan (kokoonpano) sisälle
		 */
		kokoonpano.lisaaKomponentti(emolevy);
		
		/*
		 * Kiinnitetään virtalähde vielä kopan sisälle
		 */
		kokoonpano.lisaaKomponentti(new ApplePsu());
		
		return kokoonpano;
	}

}
