package main.java.teht_03.komponentit.tehtaat.asus;

import main.java.teht_03.komponentit.Komponentti;
import main.java.teht_03.komponentit.tehtaat.*;

public class AsusTehdas extends KokoonpanoTehdas {

	@Override
	public Komponentti haeKokoonpano() {
		/*
		 * Rakennetaan Asus tehtaan kokoonpano aloittamalla kopasta
		 */
		Komponentti kokoonpano = new AsusCase();
		
		/*
		 * Luodaan emolevy
		 */
		Komponentti emolevy = new AsusMotherboard();
		
		/*
		 * Lisätään emolevyyn prosessori
		 */
		emolevy.lisaaKomponentti(new AsusCpu());
		
		/*
		 * Lisätään emolevyyn näytönohjain
		 */
		emolevy.lisaaKomponentti(new AsusGpu());
		
		/*
		 * Lisätään emolevyyn kaksi välimuisti kampaa
		 */
		emolevy.lisaaKomponentti(new AsusRam());
		emolevy.lisaaKomponentti(new AsusRam());
		
		/*
		 * Lisätään verkkokortti emolevyyn
		 */
		emolevy.lisaaKomponentti(new AsusNetworkingCard());
		
		/*
		 * Lisätään emolevy kopan (kokoonpano) sisälle
		 */
		kokoonpano.lisaaKomponentti(emolevy);
		
		/*
		 * Kiinnitetään virtalähde vielä kopan sisälle
		 */
		kokoonpano.lisaaKomponentti(new AsusPsu());
		
		return kokoonpano;
	}

}
