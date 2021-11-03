package main.java.teht_02;

public class BossTehdas extends UlkoasuTehdas {

	@Override
	public Housut createHousut() {
		return new BossHousut();
	}

	@Override
	public Jalkineet createJalkineet() {
		return new BossJalkineet();
	}

	@Override
	public Paahine createPaahine() {
		return new BossPaahine();
	}

	@Override
	public Paita createPaita() {
		return new BossPaita();
	}

}
