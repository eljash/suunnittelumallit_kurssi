package main.java.teht_11;

import java.util.Random;

public class Asiakas {
	private Object luku;
	static int players = 1;
	private String nimi = "";
	public Asiakas() {
		nimi = "Pelaaja-"+players++;
	}
	public void setLuku(Object luku) {
		this.luku = luku;
	}
	public Object getLuku() {
		return luku;
	}
	public int arvaaLuku() {
		int arvaus = new Random().nextInt(51);
		return arvaus;
	}
	public String getNimi() {
		return nimi;
	}

}
