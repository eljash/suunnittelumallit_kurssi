package main.java.teht_18_prototype;

public class Main {

	public static void main(String[] args) {
		Kello kello = new Kello();
		
		System.out.println("--Kello 1 viisarit osoittaa:");
		System.out.println(kello);
		
		System.out.println("\n--Kasvatetaan kello 1:n aikaa 80 sekunnilla");
		/*
		 * mennään 80 sekuntia eteenpäin
		 */
		for(int i = 0; i < 80; i++) {
			kello.kasvata();
		}
		System.out.println("--Kello 1 viisarit osoittaa:");
		System.out.println(kello);
		
		System.out.println("\n--Kasvatetaan kello 1:n aikaa 3600 sekunnilla");
		/*
		 * Mennään 3600 sekuntia eteenpäin = 1 tunti
		 */
		for(int i = 0; i < 3600; i++) {
			kello.kasvata();
		}
		System.out.println("--Kello 1 viisarit osoittaa:");
		System.out.println(kello);
		
		System.out.println("\n--Tehdään syväkopio kello 1:stä = kello 2");
		
		Kello kello2 = kello.clone();
		
		System.out.println("--Kello 2 viisarit osoittaa:");
		System.out.println(kello2);
		
		System.out.println("\n--Kasvatetaan kello 1:n aikaa 3600 sekunnilla");
		/*
		 * Mennään 3600 sekuntia eteenpäin = 1 tunti
		 */
		for(int i = 0; i < 3600; i++) {
			kello.kasvata();
		}
		System.out.println("--Kello 1 vs kello 2");
		System.out.println(kello);
		System.out.println(kello2);
		
		System.out.println("\n--Resetoidaan kello 1, eli kaikki viisarit osoittaa 0");
		kello.reset();
		System.out.println("--Kello 1 vs kello 2");
		System.out.println(kello);
		System.out.println(kello2);

	}

}
