package main.java.teht_13_visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("!!PELI ALKAA!!");
		
		List<Pelihahmo> hahmot = new ArrayList<Pelihahmo>();
		hahmot.add(new Pelihahmo(new PerusJarkko()));
		hahmot.add(new Pelihahmo(new PerusJarkko()));
		hahmot.add(new Pelihahmo(new PerusJarkko()));
		hahmot.add(new Pelihahmo(new TreenattuJarkko()));
		hahmot.add(new Pelihahmo(new MegaJarkko()));
		hahmot.add(new Pelihahmo(new PerusJarkko()));
		hahmot.add(new Pelihahmo(new PerusJarkko()));
		hahmot.add(new Pelihahmo(new PerusJarkko()));
		hahmot.add(new Pelihahmo(new TreenattuJarkko()));
		hahmot.add(new Pelihahmo(new MegaJarkko()));
		
		HahmoVisitor visitor = new BonusVisitor();
		
		for(int i=0;i<20;i++) {
			
			/*
			 * Tehdään kolme kertaa satunnaisia temppuja hahmoilla
			 */
			System.out.println("\n--TEMPPU VAIHE");
			for(Pelihahmo hahmo : hahmot) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				hahmo.satunnainenToiminto();
			}
			
			/*
			 * Temppujen jälkeen kyläillään jokaisessa hahmossa jakamassa 
			 * bonus pisteistä
			 */
			System.out.println("\n--VISITOR VAIHE");
			for(Pelihahmo hahmo : hahmot) {
				hahmo.accept(visitor);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
