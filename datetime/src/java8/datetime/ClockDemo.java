package java8.datetime;

import java.time.Clock;

public class ClockDemo {

	public static void main(String[] args) {

		Clock clock = Clock.systemUTC();
		System.out.println("Clock : " + clock.systemDefaultZone());
		// Returns time based on system clock zone
		Clock defaultClock = Clock.systemDefaultZone();
		System.out.println("Clock : " + clock.getZone());

	}

}
