package main.java.teht_10;

public class Main {

	public static void main(String[] args) {
		/*
		 * Luodaan kaikki tekijät
		 */
		Esimies toimitusjohtaja = new Esimies("Toimitusjohtaja-Perttu",null, 19740.27f, 100f);
		Esimies paallikko = new Esimies("Yksikön päällikkö-Tauno",toimitusjohtaja, 3650.99f, 5f);
		Esimies lahiEsimies = new Esimies("Lähiesimies-Panu",paallikko, 2250.99f, 2f);
		Tyontekija tyontekija = new Esimies("Puuseppä-Matti",lahiEsimies, 2170.20f, 0f);
		
		System.out.println("--Työntekijä pyytää 2% palkankorotusta");
		/*
		 * Työntekijä pyytää ensiksi 2% palkankorotusta
		 */
		tyontekija.pyydaPalkankorotusta(2);
		
		System.out.println("\n--Työntekijä pyytää 4% palkankorotusta");
		/*
		 * Työntekijä pyytää ensiksi 4% palkankorotusta
		 */
		tyontekija.pyydaPalkankorotusta(4);
		
		System.out.println("\n--Työntekijä pyytää 7% palkankorotusta");
		/*
		 * Työntekijä pyytää ensiksi 7% palkankorotusta
		 */
		tyontekija.pyydaPalkankorotusta(7);
		
		System.out.println("\n--Työntekijä pyytää 200% palkankorotusta");
		/*
		 * Työntekijä pyytää ensiksi 200% palkankorotusta
		 */
		tyontekija.pyydaPalkankorotusta(200);
		
	}

}
