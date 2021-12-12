package main.java.teht_21_facade;

public class CPU {
	public void freeze() {
		System.out.println("-CPU: suoritin jäädytetään");
	}
	
	public void jump(long position) {
		System.out.println("-CPU: hypätään kohtaan "+position);
	}
	
	public void execute() {
		System.out.println("-CPU: suoritetaan");
	}

}
