package main.java.teht_10;

public class Esimies extends Tyontekija {

	private double maxPalkankorotus;
	
	public Esimies(String nimi, Esimies esimies, double kkPalkka,double maxPalkankorotus) {
		super(nimi, esimies, kkPalkka);
		this.maxPalkankorotus = maxPalkankorotus;
	}
	@Override
	protected void palkankorotus(double korotusProsentti, Tyontekija pyytaja) {
		if(korotusProsentti > maxPalkankorotus && esimies!=null) {
			System.out.println(nimi+": en pysty suorittamaan näin suurta palkakorotusta "
					+ "("+korotusProsentti+"%, esimiehen maksimi on " + maxPalkankorotus +"%). "
					+ "Siirrän pyynnön esimiehelle.");
			super.palkankorotus(korotusProsentti, pyytaja);
		}
		else if(korotusProsentti <= maxPalkankorotus) {
			System.out.println(nimi+": korotan työntekijän palkkaa "
					+ "("+korotusProsentti+"%, esimiehen maksimi on " + maxPalkankorotus +"%).");
			pyytaja.korotaPalkkaa(korotusProsentti);
		} else {
			System.out.println(nimi+": en pysty suorittamaan näin suurta palkakorotusta "
					+ "("+korotusProsentti+"%, esimiehen maksimi on " + maxPalkankorotus +"%). "
					+ "Minulla ei ole esimiemiestä kenelle lähettää pyyntöä.");
		}
	}
}
