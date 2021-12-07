package main.java.teht_18_prototype;

public class Kello implements Cloneable {
	
	private SekuntiViisari sekuntiViisari;
	private MinuuttiViisari minuuttiViisari;
	private TuntiViisari tuntiViisari;
	//aika kuvastaa yhtä sekuntia
	private long aika;
	
	public Kello() {
		sekuntiViisari = new SekuntiViisari();
		minuuttiViisari = new MinuuttiViisari();
		tuntiViisari = new TuntiViisari();
		aika = 0;
	}
	
	/**
	 * kasvatetaan aikaa yhdellä sekunnilla
	 */
	public void kasvata() {
		double s = 360f/60f;
		double m = s/60f;
		double h = m/12f;
		sekuntiViisari.increaseKulma(s);
		minuuttiViisari.increaseKulma(m);
		tuntiViisari.increaseKulma(h);
	}
	
	public String toString() {
		return "Tunnit: "+tuntiViisari.getAika()+", minuutit: "+minuuttiViisari.getAika()+", sekunnit: "+sekuntiViisari.getAika();
	}
	
	public void reset() {
		sekuntiViisari.reset();
		minuuttiViisari.reset();
		tuntiViisari.reset();
	}

	public Kello clone() {
		//syväkopio
		Kello k = null;
		try {
			k = (Kello) super.clone();
			k.tuntiViisari = (TuntiViisari) tuntiViisari.clone();
			k.minuuttiViisari = (MinuuttiViisari) minuuttiViisari.clone();
			k.sekuntiViisari = (SekuntiViisari) sekuntiViisari.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return k;
	}
}
