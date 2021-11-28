package main.java.teht_13_visitor;

public class PerusJarkko implements HahmonTila {

	public PerusJarkko() {
		System.out.println("Perus-Jarkko: Moi mä oon Perus-Jarkko!");
	}
	
	@Override
	public void iske(int n) {
		System.out.println("("+n+") "+"Perus-Jarkko: Ota tästä nyrkistä!");
		
	}

	@Override
	public void aterioi(int n) {
		System.out.println("("+n+") "+"Perus-Jarkko: Kyllä lenkkimakkara tekee hyvää!");
		
	}

	@Override
	public void juo(int n) {
		System.out.println("("+n+") "+"Perus-Jarkko: Maito tyydyttää aina janon...");
		
	}

	@Override
	public void pilkkaa(int n) {
		System.out.println("("+n+") "+"Perus-Jarkko: Sinä senkin... Ääliö?!");
		
	}

	@Override
	public void jano(int n) {
		System.out.println("("+n+") "+"Perus-Jarkko: *Kyllä vähän kurkkua kuivaa, en voi puhua.*");
		
	}

	@Override
	public void nalka(int n) {
		System.out.println("("+n+") "+"Perus-Jarkko: Voi hitsi kun on nälkä, ei näillä voimilla voi lyödä.");
		
	}

	@Override
	public HahmonTila getNextState() {
		return new TreenattuJarkko();
	}
	
	@Override
	public int accept(HahmoVisitor visitor, int n) {
		return visitor.visit(this, n);
	}
	
	public int maitoa(int n) {
		System.out.println("("+n+") "+"Perus-Jarkko: Juon pillillä maitoa, enkä saa mitään bonusta.");
		return 0;
	}

}
