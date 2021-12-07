package main.java.teht_18_prototype;

/**
 * Kellon tuntiviisari. Osaa laskea viisarin kulmasta mitä tuntia se osoittaa.
 * Ei oteta huomioon AM/PM
 * 
 * @author Eljas
 *
 */
public class TuntiViisari extends Viisari implements Cloneable {
	public int getAika() {
		//kellossa on 12 tuntia, joten jaetaan 360 astetta tällä
		return (int)(12f/360f * super.getKulma());
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
