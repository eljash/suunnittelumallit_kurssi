package main.java.teht_06;

public class Pankkitili implements Pankki {
	
	protected int pin;
	protected double saldo;
	
	public Pankkitili(int pin) {
		this.pin = pin;
		saldo = 0;
	}

	@Override
	public Viesti saldo(int pin) {
		Viesti viesti = new Viesti();
		if(pin == this.pin) {
			/*
			 * Lisätään viestiin, että pin oli syötetty oikein
			 */
			viesti.pinOikein();
			viesti.setSaldo(saldo);
			return viesti;
		}
		viesti.pinVirheellinen();
		return viesti;
	}

	@Override
	public Viesti talleta(int pin, double maara) {
		Viesti viesti = new Viesti();
		if(pin == this.pin) {
			/*
			 * Lisätään viestiin, että pin oli syötetty oikein
			 */
			viesti.pinOikein();
			/*
			 * Kasvatetaan saldoa vain jos määrä on suurempi kuin 0
			 */
			if(maara>0)
				saldo+=maara;
			return viesti;
		}
		viesti.pinVirheellinen();
		return viesti;
	}

	@Override
	public Viesti nosta(int pin, double maara) {
		Viesti viesti = new Viesti();
		if(pin == this.pin) {
			/*
			 * Lisätään viestiin, että pin oli syötetty oikein
			 */
			viesti.pinOikein();
			if(maara<=saldo) {
				saldo-=maara;
				viesti.nostetaan(maara);
			} else {
				/*
				 * Lisätään viestiin, ettei tilin kate riitä
				 */
				viesti.alhainenKate();
			}
			return viesti;
		}
		viesti.pinVirheellinen();
		return viesti;
	}
	
}
