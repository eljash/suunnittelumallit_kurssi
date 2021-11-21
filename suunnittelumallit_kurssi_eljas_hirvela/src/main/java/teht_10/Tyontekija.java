package main.java.teht_10;

public abstract class Tyontekija {
	protected Tyontekija esimies;
	private double kkPalkka;
	protected String nimi;
	public Tyontekija(String nimi, Tyontekija esimies, double kkPalkka) {
		this.nimi = nimi;
		this.esimies = esimies;
		this.kkPalkka = kkPalkka;
	}
	
	/*
	 * Metodi jolla laitetaan tietyn työntekijän palkankorotus prosessi
	 * käyntiin
	 */
	public void pyydaPalkankorotusta(double korotusProsentti) {
		palkankorotus(korotusProsentti, this);
	}
	
	protected void palkankorotus(double korotusProsentti, Tyontekija pyytaja) {
		if(esimies!=null)
			esimies.palkankorotus(korotusProsentti, pyytaja);
	}
	
	protected void korotaPalkkaa(double korotusProsentti) {
		double vanhaPalkka = kkPalkka;
		kkPalkka*=(1+(0.01*korotusProsentti));
		System.out.printf("Työntekijän \"%s\" palkkaa korotettiin:\n   %.2f€/kk  ->  %.2f€/kk\n",nimi,vanhaPalkka,kkPalkka);
	}
}
