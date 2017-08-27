package java8.datetime;

import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;

public class NonISOCalendar {

	public static void main(String[] args) {

		ThaiBuddhistChronology thaiBuddhistChrono = ThaiBuddhistChronology.INSTANCE;
		ThaiBuddhistDate now = thaiBuddhistChrono.dateNow();
		
		System.out.println("Current Date  in Thai  Buddhist: " + now);
		
	}

}
