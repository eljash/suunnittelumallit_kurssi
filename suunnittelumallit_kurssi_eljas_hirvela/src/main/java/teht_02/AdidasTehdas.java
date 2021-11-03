package main.java.teht_02;

public class AdidasTehdas extends UlkoasuTehdas {

	@Override
	public Housut createHousut() {
		return new AdidasHousut();
	}

	@Override
	public Jalkineet createJalkineet() {
		return new AdidasJalkineet();
	}

	@Override
	public Paahine createPaahine() {
		return new AdidasPaahine();
	}

	@Override
	public Paita createPaita() {
		return new AdidasPaita();
	}

}
