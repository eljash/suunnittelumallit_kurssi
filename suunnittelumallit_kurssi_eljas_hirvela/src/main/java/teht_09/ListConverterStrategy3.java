package main.java.teht_09;

import java.util.List;
import java.util.ListIterator;

public class ListConverterStrategy3 implements ListConverter {

	/*
	 * Rivinvaihto jokaisen kolmannen alkion jälkeen
	 */
	@Override
	public String listToString(List<String> list) {
		String stringToReturn = "";
		for(int i = 0; i < list.size(); i++) {
			stringToReturn+=list.get(i)+" ";
			if((i+1)%3==0)
				stringToReturn+="\n";
		}
		return stringToReturn;
	}

}
