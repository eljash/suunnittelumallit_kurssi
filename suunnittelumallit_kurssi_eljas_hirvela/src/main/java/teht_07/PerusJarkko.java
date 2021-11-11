package main.java.teht_07;

public class PerusJarkko implements HahmonTila {

	public PerusJarkko() {
		System.out.println("Perus-Jarkko: Moi mä oon Perus-Jarkko!");
	}
	
	@Override
	public void iske() {
		System.out.println("Perus-Jarkko: Ota tästä nyrkistä!");
		
	}

	@Override
	public void aterioi() {
		System.out.println("Perus-Jarkko: Kyllä lenkkimakkara tekee hyvää!");
		
	}

	@Override
	public void juo() {
		System.out.println("Perus-Jarkko: Maito tyydyttää aina janon...");
		
	}

	@Override
	public void pilkkaa() {
		System.out.println("Perus-Jarkko: Sinä senkin... Ääliö?!");
		
	}

	@Override
	public void jano() {
		System.out.println("Perus-Jarkko: *Kyllä vähän kurkkua kuivaa, en voi puhua.*");
		
	}

	@Override
	public void nalka() {
		System.out.println("Perus-Jarkko: Voi hitsi kun on nälkä, ei näillä voimilla voi lyödä.");
		
	}

	@Override
	public HahmonTila getNextState() {
		return new TreenattuJarkko();
	}

}
