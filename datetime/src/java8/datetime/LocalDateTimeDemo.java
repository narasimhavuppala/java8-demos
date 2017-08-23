package java8.datetime;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;

import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {

	public static void main(String[] args) throws InterruptedException {
		LocalDate date = LocalDate.of(2017, 8, 18);
		LocalDate todayDate = LocalDate.now();
		if (date.isEqual(todayDate)) {
			System.out.println("both dates are Same");
		}
		// Finding after one week
		todayDate = todayDate.plus(2, ChronoUnit.MONTHS);
		System.out.println(todayDate);
		int year = date.getYear();
		Month month = date.getMonth();
		int day = date.getDayOfMonth();

		DayOfWeek dow = date.getDayOfWeek();
		int len = date.lengthOfMonth();
		boolean leap = date.isLeapYear();

		int y = date.get(ChronoField.YEAR);
		int m = date.get(ChronoField.MONTH_OF_YEAR);
		int d = date.get(ChronoField.DAY_OF_MONTH);

		LocalTime time = LocalTime.of(13, 45, 20);
		// LocalTime.now();
		time.plusHours(5);
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();

		LocalDateTime dt1 = LocalDateTime.of(2017, Month.AUGUST, 18, 13, 45, 20); // 2014-03-18T13:45
		// LocalDateTime.now();

		LocalDate date1 = dt1.toLocalDate();
		LocalTime time1 = dt1.toLocalTime();

		Instant instant = Instant.now();// Instant.ofEpochSecond(44 * 365 *
										// 86400);
		Thread.sleep(1000);
		Instant now = Instant.now();

		Duration duration = Duration.between(instant, now);
		System.out.println(duration.getSeconds());

		JapaneseDate japaneseDate = JapaneseDate.from(date);
		System.out.println(japaneseDate);
	}

}
