package main.java.teht_15_adapter;

public class AdapterLaskinOlio implements ILaskin {
	/*
	 * Adapterilla halutaan toteuttaa Adaptee laskinta, mutta käsiteltävät 
	 * luvut tulisi olla kokonaislukuja. Tässä adaptee annetaan 
	 * konstruktorissa oliona
	 */
	
	AdapteeLaskin adaptee;
	
	public AdapterLaskinOlio(AdapteeLaskin adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public int summa(int x, int y) {
		return (int) Math.round(adaptee.summalasku(x,y));
	}

	@Override
	public int erotus(int x, int y) {
		return (int) Math.round(adaptee.erotuslasku(x,y));
	}

	@Override
	public int tulo(int x, int y) {
		return (int) Math.round(adaptee.tulolasku(x,y));
	}

	@Override
	public int jako(int x, int y) throws Exception {
		return (int) Math.round(adaptee.jakolasku(x,y));
	}
	

}
