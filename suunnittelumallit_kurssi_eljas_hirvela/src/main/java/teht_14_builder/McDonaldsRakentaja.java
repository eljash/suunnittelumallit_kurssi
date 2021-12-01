package main.java.teht_14_builder;

public class McDonaldsRakentaja implements IHampurilaisRakentaja {
	
	private McDonaldsBurgeri burgeri;

	@Override
	public void luoUusiBurgeri() {
		burgeri = new McDonaldsBurgeri();
		
	}

	@Override
	public void asetaLeivat() {
		burgeri.asetaLeipa(new Leipa("sämpylä"));
	}

	@Override
	public void lisaaAinekset() {
		burgeri.lisaaLisuke(new Lisuke("tomaatti"));
		burgeri.lisaaLisuke(new Lisuke("sipuli"));
		burgeri.lisaaLisuke(new Lisuke("pihvi"));
		burgeri.lisaaLisuke(new Lisuke("juusto"));
		
	}

	@Override
	public void asetaKastike() {
		burgeri.lisaaLisuke(new Lisuke("ketsuppi"));
		burgeri.lisaaLisuke(new Lisuke("kurkkumajoneesi"));
		
	}

	@Override
	public Object haeHampurilainen() {
		return burgeri;
	}

}
