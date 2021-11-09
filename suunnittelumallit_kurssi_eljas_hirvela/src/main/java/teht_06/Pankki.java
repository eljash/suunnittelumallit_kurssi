package main.java.teht_06;

public interface Pankki {
	public Viesti saldo(int pin);
	public Viesti talleta(int pin, double maara);
	public Viesti nosta(int pin, double maara);
}
