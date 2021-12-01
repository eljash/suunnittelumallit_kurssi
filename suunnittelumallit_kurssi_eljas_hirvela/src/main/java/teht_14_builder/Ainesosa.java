package main.java.teht_14_builder;

public abstract class Ainesosa {
	private String nimi;
	
	public Ainesosa(String s) {
		nimi = s;
	}
	
	public void nimi(String nimi) {
		this.nimi = nimi;
	}
	
	public String toString() {
		return nimi;
	}

}
