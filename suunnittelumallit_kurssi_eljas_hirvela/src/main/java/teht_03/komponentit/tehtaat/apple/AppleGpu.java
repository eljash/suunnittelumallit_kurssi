package main.java.teht_03.komponentit.tehtaat.apple;

import main.java.teht_03.komponentit.Naytonohjain;

public class AppleGpu extends Naytonohjain {

	public AppleGpu() {
		super(699.99);
	}
	
	public AppleGpu(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("GPU: Nvidia RTX 3060");
		
	}

}
