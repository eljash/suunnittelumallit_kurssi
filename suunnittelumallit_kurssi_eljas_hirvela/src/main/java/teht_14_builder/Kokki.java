package main.java.teht_14_builder;

public class Kokki {
	private IHampurilaisRakentaja rakentaja;
	
	public Kokki() {
		rakentaja = null;
	}
	
	public Kokki(IHampurilaisRakentaja hr) {
		rakentaja = hr;
	}
	
	public void asetaRakentaja(IHampurilaisRakentaja hr) {
		rakentaja = hr;
	}
	
	public void rakennaBurgeri() {
		if(rakentaja == null)
			return;
		rakentaja.luoUusiBurgeri();
		rakentaja.asetaLeivat();
		rakentaja.lisaaAinekset();
		rakentaja.asetaKastike();
	}

}
