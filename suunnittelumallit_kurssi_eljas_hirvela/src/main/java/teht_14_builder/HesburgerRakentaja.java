package main.java.teht_14_builder;

public class HesburgerRakentaja implements IHampurilaisRakentaja {
	
	private HesburgerBurgeri burgeri;

	@Override
	public void luoUusiBurgeri() {
		burgeri = new HesburgerBurgeri();
		
	}

	@Override
	public void asetaLeivat() {
		burgeri.asetaLeipa("ruisleipä");
		
	}

	@Override
	public void lisaaAinekset() {
		burgeri.asetaLisukkeet("kasvispihvi, salaatti, suolakurkku");
		
	}

	@Override
	public void asetaKastike() {
		burgeri.asetaKastikkeet("ketsuppi, sinappi");
		
	}

	@Override
	public Object haeHampurilainen() {
		return burgeri;
	}

}
