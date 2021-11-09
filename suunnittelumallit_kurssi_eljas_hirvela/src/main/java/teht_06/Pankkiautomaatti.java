package main.java.teht_06;

public abstract class Pankkiautomaatti implements Pankki {
	protected Pankki pankki;
	public Pankkiautomaatti(Pankki pankki) {
		this.pankki = pankki;
	}

	@Override
	public Viesti saldo(int pin) {
		return pankki.saldo(pin);
	}

	@Override
	public Viesti talleta(int pin, double maara) {
		return pankki.talleta(pin, maara);
	}

	@Override
	public Viesti nosta(int pin, double maara) {
		return pankki.nosta(pin, maara);
	}

}
