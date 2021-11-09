package main.java.teht_06;

public class OttoAutomaatti extends Pankkiautomaatti {

	public OttoAutomaatti(Pankki pankki) {
		super(pankki);
	}
	
	@Override
	public Viesti saldo(int pin) {
		return super.saldo(pin);
	}

	@Override
	public Viesti talleta(int pin, double maara) {
		return super.talleta(pin, maara);
	}

	@Override
	public Viesti nosta(int pin, double maara) {
		return super.nosta(pin, maara);
	}

}
