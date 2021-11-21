package main.java.teht_09;

import java.util.List;

public class ListConverterStrategy1 implements ListConverter {

	/*
	 * Rivinvaihto jokaisen alkion jälkeen
	 */
	@Override
	public String listToString(List<String> list) {
		String stringToReturn = "";
		for(String s : list) {
			stringToReturn += s.toString()+"\n";
		}
		return stringToReturn;
	}

}
