package main.java.teht_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<ProxyImage> images = new ArrayList<ProxyImage>(Arrays.asList(
				new ProxyImage("kuvaroomasta.jpg"),new ProxyImage("italianloma1.jpg"),
				new ProxyImage("ranta.png"),new ProxyImage("pizza.png")
				));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			/*
			 * Jos lista olisi jostain syystä tyhjä, niin poistutaan silmukasta
			 */
			if(images.size()==0)
				break;
			
			for(int i = 0; i < images.size(); i++) {
				System.out.println("("+i+") "+images.get(i).getData());
			}
			System.out.println("Syötä kuvan indexi näyttääksesi kuva\npoistu - poistuaksesi");
			String input = scanner.nextLine();
			if(input.equals("poistu")) {
				System.out.println("Poistutaan ohjelmasta");
				break;
			}
			try {
				int choice = Integer.parseInt(input);
				if(choice<images.size()&&choice>=0) {
					images.get(choice).displayImage();
				}
			} catch (Exception e) {
				System.out.println("SYÖTÄ KOKONAISLUKU!");
			}
		}

	}

}
