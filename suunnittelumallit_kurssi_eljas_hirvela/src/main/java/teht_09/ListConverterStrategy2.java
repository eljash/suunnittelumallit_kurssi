package main.java.teht_09;

import java.util.List;
import java.util.ListIterator;

public class ListConverterStrategy2 implements ListConverter {

	/*
	 * Rivinvaihto jokaisen toisen alkion jälkeen
	 */
	@Override
	public String listToString(List<String> list) {
		String stringToReturn = "";
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			stringToReturn+=iterator.next()+" ";
			if(iterator.nextIndex()%2==0)
				stringToReturn+="\n";
		}
		return stringToReturn;
	}

}
