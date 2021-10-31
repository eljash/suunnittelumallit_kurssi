package main.java.teht_01;

public class TavallinenTallaaja extends AterioivaOtus {

	public Juoma createJuoma() {
		return new Pirtelo();
	}

	public Ruoka createRuoka() {
		return new Pizza();
	}
}
