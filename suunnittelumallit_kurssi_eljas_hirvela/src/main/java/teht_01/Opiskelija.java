package main.java.teht_01;

public class Opiskelija extends AterioivaOtus {

	public Juoma createJuoma() {
		return new Energiajuoma();
	}

	
	public Ruoka createRuoka() {
		return new Kouluruoka();
	}

}
