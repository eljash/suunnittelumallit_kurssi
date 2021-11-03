package main.java.teht_03.komponentit.tehtaat.asus;

import main.java.teht_03.komponentit.Emolevy;

public class AsusMotherboard extends Emolevy {

	public AsusMotherboard() {
		super(129.99);
	}
	
	public AsusMotherboard(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("Emolevy: Asus Megagamer RGB");
		
	}

}
