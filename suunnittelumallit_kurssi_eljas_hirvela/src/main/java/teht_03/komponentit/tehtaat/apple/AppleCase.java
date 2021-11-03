package main.java.teht_03.komponentit.tehtaat.apple;

import main.java.teht_03.komponentit.Koppa;

public class AppleCase extends Koppa {

	public AppleCase() {
		super(370.99);
	}
	
	public AppleCase(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("Koppa: 'tyylikäs' peltilaatikko + 200€ pyörät");
		
	}

}
