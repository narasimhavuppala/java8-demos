package java8.datetime.local;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime.toString());
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
	}

}
