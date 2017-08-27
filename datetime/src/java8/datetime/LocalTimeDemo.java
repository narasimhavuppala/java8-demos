package java8.datetime;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.of(12, 20);
		System.out.println(localTime.toString()); 
		System.out.println(localTime.getHour()); 
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
		System.out.println(localTime.MIDNIGHT); 
		System.out.println(localTime.NOON); 
	}

}
