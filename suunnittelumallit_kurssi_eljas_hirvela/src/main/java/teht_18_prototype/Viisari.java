package main.java.teht_18_prototype;

public abstract class Viisari {
	//kulma kertoo missä kulmassa viisari on
	private double kulma;
	
	public Viisari() {
		kulma = 0;
	}
	
	public Viisari(int kulma) {
		this.kulma = kulma;
	}
	
	public double getKulma() {
		double x = kulma;
		if(x/360>1) {
			int y = (int)x/360;
			x-=y*360;
		}
		return x;
	}
	
	public void reset() {
		kulma = 0;
	}
	
	public void increaseKulma(double kulma) {
		this.kulma += kulma;
	}
	
	public void increaseKulma() {
		kulma++;
	}
	
	public void setKulma(double kulma) {
		this.kulma = kulma;
	}

}
