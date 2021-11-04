package main.java.teht_04;

public class DigitalClock extends Observer {

	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct){
		timer = ct;
		timer.attach(this);
	}
	
	@Override
	public void update(Subject s) {
		if (s == timer){
			draw();
		}
	}
	
	private void draw(){
		int hour = timer.getHour();
		int minutes = timer.getMinute();
		int seconds = timer.getSecond();
		// jne. muut
		// tulosta näytölle: System.out.println(…);
		System.out.println(hour+":"+minutes+":"+seconds);
	}

}
