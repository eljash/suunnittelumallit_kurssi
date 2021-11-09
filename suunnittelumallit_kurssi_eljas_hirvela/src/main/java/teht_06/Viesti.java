package main.java.teht_06;

public class Viesti {
	private String viesti;
	protected double saldo;
	public Viesti() {
		viesti="";
		saldo=0;
	}
	public void pinVirheellinen() {
		viesti += "Syöttämäsi pin-koodi on väärin.\n";
	}
	public void pinOikein() {
		viesti += "pin-koodi ok.\n";
	}
	public void alhainenKate() {
		viesti += "Tilin kate ei riitä.\n";
	}
	public void nostetaan(double maara) {
		viesti += "Tililtä nostettiin "+maara+"€.\n";
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		viesti +="Saldo: "+saldo+"€\n";
		this.saldo = saldo;
	}
	public String getViesti() {
		return viesti;
	}

}
