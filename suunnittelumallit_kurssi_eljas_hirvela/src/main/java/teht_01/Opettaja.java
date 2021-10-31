package main.java.teht_01;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    }

	public Ruoka createRuoka() {
		return new Kotiruoka();
	};

}
