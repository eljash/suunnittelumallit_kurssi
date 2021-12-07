package main.java.teht_18_prototype;

/**
 * Kellon minuuttiviisari. Osaa laskea viisarin kulmasta mitä minuuttia se osoittaa.
 * 
 * @author Eljas
 *
 */
public class MinuuttiViisari extends Viisari implements Cloneable {
	public int getAika() {
		//tunnissa on 60 minuuttia, joten jaetaan 360 astetta tällä
		return (int)(60f/360f * super.getKulma());
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
