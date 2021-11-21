package main.java.teht_09;

import java.util.ArrayList;
import java.util.List;

public class ListHandler {
	private ListConverter strategy;
	private List<String> list;
	
	public ListHandler(ListConverter strategy) {
		this.strategy = strategy;
		list = new ArrayList<String>();
	}
	
	public void addToList(String s) {
		list.add(s);
	}
	
	public void replaceList(List<String> list) {
		this.list = list;
	}
	
	public String listToString() {
		return strategy.listToString(list);
	}
	
	public void setStrategy(ListConverter strategy) {
		this.strategy = strategy;
	}

}
