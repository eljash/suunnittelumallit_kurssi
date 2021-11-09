package main.java.teht_06;

public class Main {

	public static void main(String[] args) {
		/*
		 * Tehdään otto automaatti johon on yhdistetty pankkitili pin-koodilla "1234"
		 */
		Pankki ottoAutomaatti = new OttoAutomaatti(new Pankkitili(1234));
		
		/*
		 * Kaikki tapahtumat palauttavat Viesti-olion, jonka sisältämä viesti tulostetaan
		 */
		System.out.println("-------------Haetaan tilin saldo oikealla pin-koodilla--------------");
		System.out.println(ottoAutomaatti.saldo(1234).getViesti());
		
		System.out.println("-------------Haetaan tilin saldo väärällä pin-koodilla--------------");
		System.out.println(ottoAutomaatti.saldo(7264).getViesti());
		
		System.out.println("-------------Talletetaan tilille oikealla pin-koodilla--------------");
		System.out.println(ottoAutomaatti.talleta(1234, 99.25).getViesti());
		
		System.out.println("-------------Haetaan tilin saldo oikealla pin-koodilla--------------");
		System.out.println(ottoAutomaatti.saldo(1234).getViesti());
		
		System.out.println("-------------Nostetaan tililtä väärällä pin-koodilla--------------");
		System.out.println(ottoAutomaatti.nosta(7172, 10.10).getViesti());
		
		System.out.println("-------------Nostetaan tililtä oikealla pin-koodilla--------------");
		System.out.println(ottoAutomaatti.nosta(1234, 25.25).getViesti());
		
		System.out.println("-------------Nostetaan tilin katteen ylittävä summa oikealla pin-koodilla--------------");
		System.out.println(ottoAutomaatti.nosta(1234, 225.15).getViesti());

	}

}
