package main.java.teht_07;

public class TreenattuJarkko implements HahmonTila {
	
	public TreenattuJarkko() {
		System.out.println("Treenattu-Jarkko: TSIIGAA NÄITÄ LIHAKSIA BEIBI!");
	}

	@Override
	public void iske() {
		System.out.println("Treenattu-Jarkko: Yks, kaks, kolme, hyvää yötä!");
		
	}

	@Override
	public void aterioi() {
		System.out.println("Treenattu-Jarkko: AHH makkaraperunat kaikilla mausteilla.");
		
	}

	@Override
	public void juo() {
		System.out.println("Treenattu-Jarkko: Kylmä, huurteinen olut! Nam.");
		
	}

	@Override
	public void pilkkaa() {
		System.out.println("Treenattu-Jarkko: Kato ittees ja vertaa näihin paloihin!!!!!");
		
	}

	@Override
	public void jano() {
		System.out.println("Treenattu-Jarkko: *OISPA KALJAA NIIN VOIS HUUTAA...*");
		
	}

	@Override
	public void nalka() {
		System.out.println("Treenattu-Jarkko: *GRRRRRRRRR* vitsi nää vatsalihakset kurnii lisää protskuu.");
		
	}

	@Override
	public HahmonTila getNextState() {
		// TODO Auto-generated method stub
		return new MegaJarkko();
	}

}
