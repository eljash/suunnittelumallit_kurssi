package main.java.teht_07;

public class Pelihahmo {
	private HahmonTila tila;
	private int xp = 0;
	private final int xp_to_levelup = 20;
	private int neste = 10;
	private int ravinto = 10;
	
	public Pelihahmo(HahmonTila tila) {
		this.tila = tila;
	}
	
	public void iske() {
		if(ravinto>0) {
			ravinto--;
			tila.iske();
			kehitys(3);
			return;
		}
		tila.nalka();
	}
	public void aterioi() {
		ravinto+=2;
		tila.aterioi();
		kehitys(1);
	}
	public void juo() {
		neste+=2;
		tila.juo();
		kehitys(1);
	}
	public void pilkkaa() {
		if(neste>0) {
			neste--;
			tila.pilkkaa();
			kehitys(2);
			return;
		}
		tila.jano();
	}
	private void kehitys(int xp) {
		this.xp+=xp;
		if(this.xp >= xp_to_levelup) {
			System.out.println("!!HAHMO KEHITTYY!!");
			this.xp-=xp_to_levelup;
			tila = tila.getNextState();
		}
	}
}
