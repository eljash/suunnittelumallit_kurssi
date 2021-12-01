package main.java.teht_14_builder;

public class Main {

	public static void main(String[] args) {
		HesburgerRakentaja HR = new HesburgerRakentaja();
		McDonaldsRakentaja MDR = new McDonaldsRakentaja();
		Kokki kokki = new Kokki();
		
		System.out.println("--HESBURGERIN KOKKI TEKEE BURGERIN");
		kokki.asetaRakentaja(HR);
		kokki.rakennaBurgeri();
		HesburgerBurgeri HBurgeri = (HesburgerBurgeri) HR.haeHampurilainen();
		System.out.println(HBurgeri);
		
		System.out.println("\n--MCDONALDS KOKKI TEKEE BURGERIN");
		kokki.asetaRakentaja(MDR);
		kokki.rakennaBurgeri();
		McDonaldsBurgeri MBurgeri = (McDonaldsBurgeri) MDR.haeHampurilainen();
		System.out.println(MBurgeri);

	}

}
