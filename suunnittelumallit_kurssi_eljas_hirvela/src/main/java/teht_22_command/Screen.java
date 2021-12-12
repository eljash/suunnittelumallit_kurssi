package main.java.teht_22_command;

public class Screen {
	boolean up;
	
	public Screen() {
		up = false;
	}
	
	public void rollUp() {
		if(up)
			System.out.println("Screen.rollUp: Valkokangas on jo ylhäällä.");
		else
			System.out.println("Screen.rollUp: Valkokangas nousee ylös.");
		up = true;
	}
	public void rollDown() {
		if(!up)
			System.out.println("Screen.rollDown: Valkokangas on jo alhaalla.");
		else
			System.out.println("Screen.rollDown: Valkokangas laskee alas.");
		up = false;
	}
}
