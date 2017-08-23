package java8.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DurationExample {

	public static void main(String[] args) {

		Duration oneHours = Duration.ofHours(1);
		System.out.println(oneHours.getSeconds() + " seconds");

		Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
		System.out.println(oneHours2.getSeconds() + " seconds");

		// Test Duration.between
		System.out.println("\n--- Duration.between --- ");

		LocalDateTime oldDate = LocalDateTime.of(2017, Month.JANUARY, 31, 10, 20, 55);
		LocalDateTime newDate = LocalDateTime.now();


		// count seconds between dates
		Duration duration = Duration.between(oldDate, newDate);

		System.out.println(duration.getSeconds() + " seconds");
	}

}
