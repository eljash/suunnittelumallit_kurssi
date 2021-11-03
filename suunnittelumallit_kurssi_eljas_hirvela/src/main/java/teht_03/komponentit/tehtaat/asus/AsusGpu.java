package main.java.teht_03.komponentit.tehtaat.asus;

import main.java.teht_03.komponentit.Naytonohjain;

public class AsusGpu extends Naytonohjain {

	public AsusGpu() {
		super(479.71);
	}
	
	public AsusGpu(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("GPU: Asus RTX 3060");
		
	}

}
