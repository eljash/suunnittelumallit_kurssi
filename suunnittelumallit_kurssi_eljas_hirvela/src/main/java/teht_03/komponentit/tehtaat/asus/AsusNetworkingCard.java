package main.java.teht_03.komponentit.tehtaat.asus;

import main.java.teht_03.komponentit.Lisakortti;

public class AsusNetworkingCard extends Lisakortti {

	public AsusNetworkingCard() {
		super(85.99);
	}
	
	public AsusNetworkingCard(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("Verkkokortti: Asus 10gb + WLAN");
		
	}

}
