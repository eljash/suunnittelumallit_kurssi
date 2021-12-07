package main.java.teht_18_prototype;

/**
 * Kellon sekuntiviisari. Osaa laskea viisarin kulmasta mitä sekuntia se osoittaa.
 * 
 * @author Eljas
 *
 */
public class SekuntiViisari extends Viisari implements Cloneable {
	public int getAika() {
		//minuutissa on 60 sekuntia, joten jaetaan 360 astetta tällä
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
