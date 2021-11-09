package main.java.teht_05;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		/*
		 * Haetaan istunnon käyttäjän nimi ja syntymäpäivä
		 * "tyhjiä", koska ilmentymä luodaan vasta hakiessa
		 */
		String syntyma = Istunto.syntymaString();
		String nimi = Istunto.getNimi();
		
		System.out.println("Käyttäjänimi: "+nimi);
		System.out.println("Syntymäpäivä: "+syntyma);
		
		/*
		 * "Toteutetaan" Markuksen istunto
		 */
		
		Istunto.setNimi("MarkuksenIstunto");
		Istunto.setSyntyma(1979, 7, 9);
		syntyma = Istunto.syntymaString();
		nimi = Istunto.getNimi();
		
		System.out.println("\nKäyttäjänimi: "+nimi);
		System.out.println("Syntymäpäivä: "+syntyma);

	}

}
