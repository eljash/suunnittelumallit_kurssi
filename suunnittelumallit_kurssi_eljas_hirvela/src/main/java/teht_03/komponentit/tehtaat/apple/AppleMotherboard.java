package main.java.teht_03.komponentit.tehtaat.apple;

import main.java.teht_03.komponentit.Emolevy;

public class AppleMotherboard extends Emolevy {

	public AppleMotherboard() {
		super(229.99);
	}
	
	public AppleMotherboard(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("Emolevy: ilman mitään herkkuja");
		
	}

}
