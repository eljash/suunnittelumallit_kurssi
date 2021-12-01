package main.java.teht_14_builder;

public class HesburgerBurgeri {
	private String leipa = "";
	private String lisukkeet = "";
	private String kastikkeet = "";
	
	public void asetaLeipa(String leipa) {
		this.leipa = leipa;
	}
	
	public void asetaLisukkeet(String lisukkeet) {
		this.lisukkeet = lisukkeet;
	}
	
	public void asetaKastikkeet(String kastikkeet) {
		this.kastikkeet = kastikkeet;
	}
	
	public String toString() {
		return "Leipä: "+leipa+", lisukkeet: "+lisukkeet+", kastikkeet: "+kastikkeet+".";
	}

}
