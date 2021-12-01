package main.java.teht_15_adapter;

public class AdapteeLaskin {
	/*
	 * Adaptee laskin joka ottaa vastaan, sekä palauttaa murtolukuja
	 */
	public double summalasku(double x, double y) {
		return x + y;
	}
	public double erotuslasku(double x, double y) {
		return x - y;
	}
	public double tulolasku(double x, double y) {
		return x * y;
	}
	public double jakolasku(double x, double y) throws Exception {
		if(y==0)
			throw new Exception("Nollalla ei voi jakaa.");
		return x / y;
	}
}
