package main.java.teht_03;

import main.java.teht_03.komponentit.tehtaat.KokoonpanoTehdas;

public class main {

	public static void main(String[] args) {
		double summa1 = 0;
		double summa2 = 0;
		
		/*
		 * Haetaan ensiksi "asus" tehdas
		 * 
		 * Käytetään Reflection API:a. Tämän toteutus löytyy 
		 * "HaeOminaisuuksista"-luokan sisältä
		 */
		KokoonpanoTehdas tehdas = HaeOminaisuuksista.haeAsus();
		
		/*
		 * Varmistetaan ettei tehdas ole null
		 */
		if(tehdas!=null) {
			System.out.println("-----Asus tehtaan kokoonpano-----");
			tehdas.listaaKokoonpano();
			summa1 = tehdas.getKokoonpanonHinta();
		}
		
		/*
		 * Varmistetaan ettei tehdas ole null
		 */
		tehdas = HaeOminaisuuksista.haeApple();
		if(tehdas!=null) {
			System.out.println("\n-----Apple tehtaan kokoonpano-----");
			tehdas.listaaKokoonpano();
			summa2 = tehdas.getKokoonpanonHinta();
		}
		System.out.println("\nKokoonpano 1 hinta: "+summa1
				+"€\nKokoonpano 2 hinta: "+summa2+"€");

	}

}
