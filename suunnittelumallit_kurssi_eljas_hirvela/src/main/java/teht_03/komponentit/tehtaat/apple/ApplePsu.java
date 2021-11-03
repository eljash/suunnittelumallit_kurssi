package main.java.teht_03.komponentit.tehtaat.apple;

import main.java.teht_03.komponentit.Virtalahde;

public class ApplePsu extends Virtalahde {

	public ApplePsu() {
		super(89.99);
	}
	
	public ApplePsu(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("Virtalähde: Seasonic 1200W");
		
	}

}
