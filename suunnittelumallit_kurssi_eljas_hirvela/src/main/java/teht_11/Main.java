package main.java.teht_11;

public class Main {

	public static void main(String[] args) {
		boolean lukuArvattu = false;
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Asiakas[] pelaajat = new Asiakas[] {
			new Asiakas(),new Asiakas(),new Asiakas(),
			new Asiakas(),new Asiakas(),new Asiakas(),
			new Asiakas(),new Asiakas(),new Asiakas()
		};

		for(Asiakas a : pelaajat)
			arvuuttaja.liityPeliin(a);
		while(!lukuArvattu) {
			for(Asiakas a : pelaajat) {
				if(arvuuttaja.arvaaLukua(a)) {
					lukuArvattu = true;
					break;
				}
			}
		}
		System.out.println("Peli päättyi");
	}

}
