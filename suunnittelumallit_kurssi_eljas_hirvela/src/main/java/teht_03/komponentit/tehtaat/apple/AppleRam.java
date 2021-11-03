package main.java.teht_03.komponentit.tehtaat.apple;

import main.java.teht_03.komponentit.Valimuisti;

public class AppleRam extends Valimuisti {

	public AppleRam() {
		super(197.99);
	}
	
	public AppleRam(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("RAM: Corsair 16gb 3200mhz");
		
	}

}
