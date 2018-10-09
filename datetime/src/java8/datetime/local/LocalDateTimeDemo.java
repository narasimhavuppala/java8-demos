package java8.datetime.local;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;

import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {

	public static void main(String[] args) throws InterruptedException {

		LocalDateTime dt1 = LocalDateTime.now();
		LocalDate date = dt1.toLocalDate();
		LocalTime time = dt1.toLocalTime();

		Instant instant = Instant.now();// Instant.ofEpochSecond(44 * 365 *
		Thread.sleep(1000);
		Instant now = Instant.now();

		Duration duration = Duration.between(instant, now);
		System.out.println(duration.getSeconds());

		Period period = Period.between(date, LocalDate.of(2017, 12, 31));
		System.out.println(period.getYears());

		JapaneseDate japaneseDate = JapaneseDate.from(date);
		System.out.println(japaneseDate);
	}

}
