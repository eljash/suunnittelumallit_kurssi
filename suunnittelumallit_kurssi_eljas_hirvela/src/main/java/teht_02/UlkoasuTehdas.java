package main.java.teht_02;

public abstract class UlkoasuTehdas {
	private Housut housut = null;
	private Jalkineet jalkineet = null;
	private Paahine paahine = null;
	private Paita paita = null;
	
	public abstract Housut createHousut();
	public abstract Jalkineet createJalkineet();
	public abstract Paahine createPaahine();
	public abstract Paita createPaita();
	
	public void ulkoasu() {
		vaatteet();
		luetteOutfit();
	}
	
	private void luetteOutfit() {
		System.out.println("Minulla on päälläni hienot "
							+housut+", "+jalkineet+", "
							+paahine+" ja "+paita);
	}
	
	private void vaatteet() {
		if(housut==null)
			housut = createHousut();
		if(jalkineet==null)
			jalkineet = createJalkineet();
		if(paahine==null)
			paahine = createPaahine();
		if(paita==null)
			paita = createPaita();
	}
}
