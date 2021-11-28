package main.java.teht_13_visitor;

import java.util.Random;

public class Pelihahmo {
	private HahmonTila tila;
	private int xp = 0;
	private final int xp_to_levelup = 20;
	private int neste = 10;
	private int ravinto = 10;
	private static int hahmojen_maara = 0;
	private int numero;
	
	public Pelihahmo(HahmonTila tila) {
		this.tila = tila;
		numero = hahmojen_maara++;
	}
	
	public void iske() {
		if(ravinto>0) {
			ravinto--;
			tila.iske(numero);
			kehitys(3);
			return;
		}
		tila.nalka(numero);
	}
	public void aterioi() {
		ravinto+=2;
		tila.aterioi(numero);
		kehitys(1);
	}
	public void juo() {
		neste+=2;
		tila.juo(numero);
		kehitys(1);
	}
	public void pilkkaa() {
		if(neste>0) {
			neste--;
			tila.pilkkaa(numero);
			kehitys(2);
			return;
		}
		tila.jano(numero);
	}
	private void kehitys(int xp) {
		this.xp+=xp;
		if(this.xp >= xp_to_levelup) {
			System.out.println("!!HAHMO KEHITTYY!!");
			this.xp-=xp_to_levelup;
			tila = tila.getNextState();
		}
	}
	
	public void accept(HahmoVisitor visitor) {
		kehitys(tila.accept(visitor, numero));
	}
	
	public void satunnainenToiminto() {
		Random rand = new Random();
		int teko = rand.nextInt((3)+1);
		switch(teko) {
			case 0:
				iske();
				break;
			case 1:
				aterioi();
				break;
			case 2:
				juo();
				break;
			case 3:
				pilkkaa();
				break;
			default:
				iske();
				break;
		}
	}
}
