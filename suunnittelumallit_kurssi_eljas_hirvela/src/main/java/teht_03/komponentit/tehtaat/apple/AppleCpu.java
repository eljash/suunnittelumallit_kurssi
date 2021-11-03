package main.java.teht_03.komponentit.tehtaat.apple;

import main.java.teht_03.komponentit.Prosessori;

public class AppleCpu extends Prosessori {

	public AppleCpu() {
		super(329.89);
	}
	
	public AppleCpu(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("Prosessori: Intel Core i5");
		
	}

}
