package main.java.teht_04;

public class main {

	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		Observer clock = new DigitalClock(timer);
		timer.tick();
	}

}
