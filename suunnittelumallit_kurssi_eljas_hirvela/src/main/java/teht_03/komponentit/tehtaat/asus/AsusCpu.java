package main.java.teht_03.komponentit.tehtaat.asus;

import main.java.teht_03.komponentit.Prosessori;

public class AsusCpu extends Prosessori {

	public AsusCpu() {
		super(239.89);
	}
	
	public AsusCpu(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("Prosessori: Intel Core i5");
		
	}

}
