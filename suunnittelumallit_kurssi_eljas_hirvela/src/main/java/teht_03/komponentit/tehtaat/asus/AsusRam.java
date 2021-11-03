package main.java.teht_03.komponentit.tehtaat.asus;

import main.java.teht_03.komponentit.Valimuisti;

public class AsusRam extends Valimuisti {

	public AsusRam() {
		super(87.99);
	}
	
	public AsusRam(int hinta) {
		super(hinta);
	}

	@Override
	public void komponentinKuvaus() {
		System.out.println("RAM: Asus 8gb 3200mhz");
		
	}

}
