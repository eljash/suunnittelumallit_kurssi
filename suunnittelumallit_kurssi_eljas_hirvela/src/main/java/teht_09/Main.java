package main.java.teht_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(
				Arrays.asList(
						"Rypsiöljy", "Vanukas", "Pihvi", "Maito", "Voi",
						"Makkara", "Salaatti", "Feta", "Juusto", "Sokeri",
						"Suola", "Pippuri", "Kebab", "Ruokakerma", "Smetana"
						)
				);
		
		/*
		 * Ensiksi tuoteutetaan ensimmäinen strategia:
		 * rivinvaihtomerkki joka alkion jälkeen
		 */
		System.out.println("--STRATEGIA 1: RIVINVAIHTO JOKAISEN ALKION JÄLKEEN");
		ListHandler handler = new ListHandler(new ListConverterStrategy1());
		/*
		 * Annetaan aikaisemmin luotu lista "handler" oliolle
		 */
		handler.replaceList(list);
		System.out.println(handler.listToString());
		
		System.out.println("\n\n--STRATEGIA 2: RIVINVAIHTO JOKA TOISEN ALKION JÄLKEEN");
		handler.setStrategy(new ListConverterStrategy2());
		System.out.println(handler.listToString());
		
		System.out.println("\n\n--STRATEGIA 3: RIVINVAIHTO JOKA KOLMANNEN ALKION JÄLKEEN");
		handler.setStrategy(new ListConverterStrategy3());
		System.out.println(handler.listToString());
		
	}

}
