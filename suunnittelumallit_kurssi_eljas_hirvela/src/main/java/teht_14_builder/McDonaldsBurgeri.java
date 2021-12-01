package main.java.teht_14_builder;

import java.util.ArrayList;
import java.util.List;

public class McDonaldsBurgeri {
	private Leipa leipa;
	private List<Lisuke> lisukkeet = new ArrayList<Lisuke>();
	
	public void asetaLeipa(Leipa leipa) {
		this.leipa = leipa;
	}
	
	public void lisaaLisuke(Lisuke lisuke) {
		lisukkeet.add(lisuke);
	}
	
	public String toString() {
		String merkkijono = "";
		if(leipa!=null)
			merkkijono+="Leipä: "+leipa.toString();
		if(lisukkeet.size()>0)
			merkkijono+=", Täytteet: ";
		for(int i = 0; i<lisukkeet.size(); i++) {
			merkkijono+=lisukkeet.get(i);
			if(i<lisukkeet.size()-1)
				merkkijono+=", ";
		}
		return merkkijono+".";
	}

}
