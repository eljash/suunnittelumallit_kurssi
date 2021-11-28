package main.java.teht_13_visitor;

public class MegaJarkko implements HahmonTila {
	
	public MegaJarkko() {
		System.out.println("MEGA-Jarkko: TERVVVVE! MAAILMA EI OO MUNLAISTA ENNEN NÄHNY!!!!");
	}

	@Override
	public void iske(int n) {
		System.out.println("("+n+") "+"MEGA-Jarkko: VÄHÄ KOUKKUA NAAMAAN JA KURKIPOTKULLA UNILLE SA#?%NA");
		
	}

	@Override
	public void aterioi(int n) {
		System.out.println("("+n+") "+"MEGA-Jarkko: KOKO BUFE TARJONTA MENI SINNE, KYLLÄ TEKI HYVÄÄ!");
		
	}

	@Override
	public void juo(int n) {
		System.out.println("("+n+") "+"MEGA-Jarkko: kyllä vesilasillinen aina maistuu :)");
		
	}

	@Override
	public void pilkkaa(int n) {
		System.out.println("("+n+") "+"MEGA-Jarkko: *hemo pieru*");
		
	}

	@Override
	public void jano(int n) {
		System.out.println("("+n+") "+"MEGA-Jarkko: TÄTÄ MIESTÄ EI JANO ESTÄ, TULE TÄNNE!");
		
	}

	@Override
	public void nalka(int n) {
		System.out.println("("+n+") "+"MEGA-Jarkko: NYT VOIS SYÖDÄ KOKO NAVETAN!");
		
	}

	@Override
	public HahmonTila getNextState() {
		return new MegaJarkko();
	}

	@Override
	public int accept(HahmoVisitor visitor, int n) {
		return visitor.visit(this, n);
	}
	
	public int lepaa(int n) {
		System.out.println("("+n+") "+"MEGA-Jarkko: LEPÄÄN JA ANSAITSEN 10 EKSTRA XP:tä!");
		return 10;
	}

}
