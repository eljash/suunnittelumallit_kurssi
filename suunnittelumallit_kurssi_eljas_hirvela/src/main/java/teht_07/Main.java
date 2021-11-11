package main.java.teht_07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("!!PELI ALKAA!!");
		Scanner sc = new Scanner(System.in);
		Pelihahmo hahmo = new Pelihahmo(new PerusJarkko());
		String input = "";
		
		while(!input.equals("poistu")) {
			System.out.println("\n-----MITÄ TEHDÄÄN-----\n"+
							"1. iske\n2. pilkkaa\n3. aterioi\n4. juo\npoistu. poistu");
			input = sc.nextLine();
			switch(input) {
			case "1":
				hahmo.iske();
				break;
			case "2":
				hahmo.pilkkaa();
				break;
			case "3":
				hahmo.aterioi();
				break;
			case "4":
				hahmo.juo();
				break;
			case "poistu":
				break;
			default:
				System.out.println("SYÖTÄ NYT OIKEA VAIHTOEHTO...");
				break;
			}
		}

	}

}
