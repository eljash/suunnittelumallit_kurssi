package main.java.teht_03.komponentit;

import java.util.HashSet;
import java.util.Set;

public abstract class Komponentti {
	/*
	 * Käytetään Set-rajapintaa, jottei duplikaatteja lisätä komponentteihin
	 */
	private Set<Komponentti> komponentit = new HashSet<Komponentti>();
	private double hinta = 0;
	
	public abstract void komponentinKuvaus();
	
	public Komponentti(double hinta) {
		this.hinta = hinta;
	}
	
	public void lisaaKomponentti(Komponentti k) {
		komponentit.add(k);
	}
	
	public void poistaKomponentti(Komponentti k) {
		komponentit.remove(k);
	}
	
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	
	public void listaaKomponentit() {
		for(Komponentti k : komponentit)
			k.listaaKomponentit();
		komponentinKuvaus();
	}
	
	
	
	public double getHinta() {
		double summa = 0;
		for(Komponentti k : komponentit) {
			summa+= k.getHinta();
		}
		return Math.round((summa+hinta) * 100.0) / 100.0;
	}
	
}
