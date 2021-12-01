package main.java.teht_15_adapter;

public class AdapterLaskinExtend extends AdapteeLaskin implements ILaskin {
	/*
	 * Adapterilla halutaan toteuttaa Adaptee laskinta, mutta käsiteltävät 
	 * luvut tulisi olla kokonaislukuja. Tämä toteutus toteuttaa 
	 * adaptee laskimen
	 */

	@Override
	public int summa(int x, int y) {
		return (int) Math.round(summalasku(x,y));
	}

	@Override
	public int erotus(int x, int y) {
		return (int) Math.round(erotuslasku(x,y));
	}

	@Override
	public int tulo(int x, int y) {
		return (int) Math.round(tulolasku(x,y));
	}

	@Override
	public int jako(int x, int y) throws Exception {
		return (int) Math.round(jakolasku(x,y));
	}
	

}
