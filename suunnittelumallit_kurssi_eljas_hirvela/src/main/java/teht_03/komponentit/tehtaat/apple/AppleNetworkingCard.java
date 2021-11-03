package main.java.teht_03.komponentit.tehtaat.apple;

import main.java.teht_03.komponentit.Lisakortti;

public class AppleNetworkingCard extends Lisakortti {

	public AppleNetworkingCard() {
		super(185.99);
	}
	
	public AppleNetworkingCard(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("Verkkokortti: Intel 10gb + WLAN");
		
	}

}
