package main.java.teht_02;

public abstract class Koodaaja {
	private UlkoasuTehdas ulkoasu = null;
	
	public Koodaaja(UlkoasuTehdas tehdas) {
		ulkoasu = tehdas;
	}
	
	public void vaihdaUlkoasua(UlkoasuTehdas uusiUlkoasu) {
		ulkoasu = uusiUlkoasu;
	}
	
	public void kerroUlkoasusta() {
		ulkoasu.ulkoasu();
	}
}
