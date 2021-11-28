package main.java.teht_13_visitor;

public class TreenattuJarkko implements HahmonTila {
	
	public TreenattuJarkko() {
		System.out.println("Treenattu-Jarkko: TSIIGAA NÄITÄ LIHAKSIA BEIBI!");
	}

	@Override
	public void iske(int n) {
		System.out.println("("+n+") "+"Treenattu-Jarkko: Yks, kaks, kolme, hyvää yötä!");
		
	}

	@Override
	public void aterioi(int n) {
		System.out.println("("+n+") "+"Treenattu-Jarkko: AHH makkaraperunat kaikilla mausteilla.");
		
	}

	@Override
	public void juo(int n) {
		System.out.println("("+n+") "+"Treenattu-Jarkko: Kylmä, huurteinen olut! Nam.");
		
	}

	@Override
	public void pilkkaa(int n) {
		System.out.println("("+n+") "+"Treenattu-Jarkko: Kato ittees ja vertaa näihin paloihin!!!!!");
		
	}

	@Override
	public void jano(int n) {
		System.out.println("("+n+") "+"Treenattu-Jarkko: *OISPA KALJAA NIIN VOIS HUUTAA...*");
		
	}

	@Override
	public void nalka(int n) {
		System.out.println("("+n+") "+"Treenattu-Jarkko: *GRRRRRRRRR* vitsi nää vatsalihakset kurnii lisää protskuu.");
		
	}

	@Override
	public HahmonTila getNextState() {
		// TODO Auto-generated method stub
		return new MegaJarkko();
	}
	
	@Override
	public int accept(HahmoVisitor visitor, int n) {
		return visitor.visit(this, n);
	}
	
	public int steroideja(int n) {
		System.out.println("("+n+") "+"Treenattu-Jarkko: laitan vähän steroideja, niin saan 15 xp:tä.");
		return 15;
	}

}
