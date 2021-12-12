package main.java.teht_21_facade;

import java.util.ArrayList;
import java.util.List;

public class Memory {
	private List<String> data;
	
	public Memory() {
		data = new ArrayList<String>();
	}
	
	public void load(long position, String dataToAdd) {
		//Varmistetaan, että data lista on tarpeeksi suuri, jotta voidaan lisätä tieto oikeaan indeksiin
		long diff = position+1 - data.size();
		//Lisätään data listaan tarvittava määrä null-alkoita, jotta saadaan tieto oikeaan paikkaan
		if(diff>0)
			for(long i = diff;i>0;i--)
				data.add(null);
		data.set((int)position, dataToAdd);
		System.out.println("-MEMORY: '"+dataToAdd+"' lisättiin paikkaan: "+position);
			
	}

}
