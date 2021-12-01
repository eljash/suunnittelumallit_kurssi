package main.java.teht_15_adapter;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-Toteutetaan adaptee laskin olio toteutuksella");
		ILaskin laskin = new AdapterLaskinOlio(new AdapteeLaskin());
		System.out.println("5+6 = "+laskin.summa(5, 6));
		System.out.println("5-6 = "+laskin.erotus(5, 6));
		System.out.println("5*6 = "+laskin.tulo(5, 6));
		try {
			System.out.println("5/6 = "+laskin.jako(5, 6));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("5/0 = "+laskin.jako(5, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("-\nToteutetaan adaptee laskin olio toteutuksella");
		laskin = new AdapterLaskinExtend();
		System.out.println("5+6 = "+laskin.summa(5, 6));
		System.out.println("5-6 = "+laskin.erotus(5, 6));
		System.out.println("5*6 = "+laskin.tulo(5, 6));
		try {
			System.out.println("5/6 = "+laskin.jako(5, 6));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("5/0 = "+laskin.jako(5, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
