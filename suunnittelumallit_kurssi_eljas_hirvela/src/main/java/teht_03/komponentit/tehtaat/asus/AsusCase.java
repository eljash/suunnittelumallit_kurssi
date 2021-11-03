package main.java.teht_03.komponentit.tehtaat.asus;

import main.java.teht_03.komponentit.Koppa;

public class AsusCase extends Koppa {

	public AsusCase() {
		super(43.99);
	}
	
	public AsusCase(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("Koppa: iso peltilaatikko");
		
	}

}
