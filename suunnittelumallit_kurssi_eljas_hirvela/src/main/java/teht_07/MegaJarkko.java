package main.java.teht_07;

public class MegaJarkko implements HahmonTila {
	
	public MegaJarkko() {
		System.out.println("MEGA-Jarkko: TERVVVVE! MAAILMA EI OO MUNLAISTA ENNEN NÄHNY!!!!");
	}

	@Override
	public void iske() {
		System.out.println("MEGA-Jarkko: VÄHÄ KOUKKUA NAAMAAN JA KURKIPOTKULLA UNILLE SA#?%NA");
		
	}

	@Override
	public void aterioi() {
		System.out.println("MEGA-Jarkko: KOKO BUFE TARJONTA MENI SINNE, KYLLÄ TEKI HYVÄÄ!");
		
	}

	@Override
	public void juo() {
		System.out.println("MEGA-Jarkko: kyllä vesilasillinen aina maistuu :)");
		
	}

	@Override
	public void pilkkaa() {
		System.out.println("MEGA-Jarkko: *hemo pieru*");
		
	}

	@Override
	public void jano() {
		System.out.println("MEGA-Jarkko: TÄTÄ MIESTÄ EI JANO ESTÄ, TULE TÄNNE!");
		
	}

	@Override
	public void nalka() {
		System.out.println("MEGA-Jarkko: NYT VOIS SYÖDÄ KOKO NAVETAN!");
		
	}

	@Override
	public HahmonTila getNextState() {
		return new MegaJarkko();
	}

}
