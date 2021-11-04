package main.java.teht_04;

import java.time.LocalDateTime;

public class ClockTimer extends Subject {
	int h;
	int min;
	int sec;
	
	public ClockTimer() {
		h=0;min=0;sec=0;
	}
	
	public int getHour(){
		return h;
	}
	public int getMinute(){
		return min;
	}
	public int getSecond(){
		return sec;
	}
	void tick(){
		LocalDateTime time = LocalDateTime.now();
		h=time.getHour();
		min=time.getMinute();
		sec=time.getSecond();
		notifyObservers();
	}
}
