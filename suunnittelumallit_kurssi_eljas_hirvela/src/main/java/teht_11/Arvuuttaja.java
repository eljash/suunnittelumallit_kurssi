package main.java.teht_11;

import java.util.Random;

public class Arvuuttaja {
	public void liityPeliin(Asiakas pelaaja) {
		//0-50
		int luku = new Random().nextInt(51);
		System.out.println("Pelaaja "+pelaaja.getNimi()+" sai luvukseen: "+luku);
		pelaaja.setLuku(new Memento(luku));
	}
	public boolean arvaaLukua(Asiakas pelaaja) {
		try {
			Memento memento = (Memento) pelaaja.getLuku();
			int pelaajanArvaus = pelaaja.arvaaLuku();
			System.out.println(pelaaja.getNimi()+" arvasi lukua: "+pelaajanArvaus+" ("+memento.luku+")");
			if(memento.luku==pelaajanArvaus) {
				System.out.println(pelaaja.getNimi()+" arvaus oli oikein!");
				return true;
			}
		} catch (Exception e) {
			System.err.println("Pelaaja ei ole liittynyt peliin ja yritti arvata lukua");
		}
		
		return false;
		//return Integer.valueOf(memento.luku).equals(Integer.valueOf(pelaajanArvaus));
	}
	
	private class Memento {
		private int luku;
		public Memento(int luku) {
			this.luku = luku;
		}

	}
}

