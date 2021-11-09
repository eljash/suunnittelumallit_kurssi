package main.java.teht_05;

public class Istunto {
	private static Istunto instance;
	private String kayttajaNimi;
	private int day;
	private int month;
	private int year;
	
	private Istunto() {
		kayttajaNimi = "";
		day = 0;
		month = 0;
		year = 0;
	}
	
	public static void setNimi(String nimi) {
		Istunto.getInstance().kayttajaNimi = nimi;
	}
	
	public static void setSyntyma(int y, int m, int d) {
		if(y>=0&&m>=0&&d>=0) {
			Istunto.getInstance().day = d;
			Istunto.getInstance().month = m;
			Istunto.getInstance().year = y;
		}
	}
	
	public static String getNimi() {
		return Istunto.getInstance().kayttajaNimi;
	}
	
	public static String syntymaString() {
		return Istunto.getInstance().day+"."+Istunto.getInstance().month+"."+Istunto.getInstance().year;
	}
	
	public static Istunto getInstance() {
		if(instance==null)
			instance=new Istunto();
		return instance;
	}

}
