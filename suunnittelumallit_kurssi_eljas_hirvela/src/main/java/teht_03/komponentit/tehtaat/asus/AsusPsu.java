package main.java.teht_03.komponentit.tehtaat.asus;

import main.java.teht_03.komponentit.Virtalahde;

public class AsusPsu extends Virtalahde {

	public AsusPsu() {
		super(289.99);
	}
	
	public AsusPsu(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("Virtalähde: Asus GamerPower 2000W");
		
	}

}
