package java8.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

public class DateTimeDemo {

	static DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");

	public static void main(String[] args) throws InterruptedException {
		// useOldDate();
		// useLocalDateTime();
		// useTemporalAdjuster();
		// useDateFormatter();
		//useClock();
		useTimeZone();
	}

	private static void useOldDate() {

		Date date = new Date(115, 3, 18);
		System.out.println(date);
		System.out.println(df.format(date));

		Calendar calendar = Calendar.getInstance();
		calendar.set(2014, Calendar.FEBRUARY, 18);
		System.out.println(calendar.getTime());

	}

	private static void useLocalDateTime() throws InterruptedException {
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

	/***
	 * Temporal Adjusters uses to modify the Temporal Object
	 */
	private static void useTemporalAdjuster() {
		LocalDate date = LocalDate.of(2017, 8, 15);
		// LocalDate.now();

		date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

		System.out.println(date);
		date = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(date);
		date = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(date);

		date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println(date);

	}

	private static void useDateFormatter() {
		LocalDate date = LocalDate.of(2017, 8, 12);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);

		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(date.format(formatter));
		System.out.println(date.format(italianFormatter));

	}

	private static void useTimeZone() {
		Set<String> zonees=ZoneId.getAvailableZoneIds();
//		for(String s:zonees){
//			System.out.println(s);
//		}
		ZoneId america = ZoneId.of("America/New_York");
		LocalDateTime localtDateAndTime = LocalDateTime.now();
		ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, america);
		System.out.println(dateAndTimeInNewYork);

	}

	private static void useClock() {

		Clock clock = Clock.systemUTC();
		System.out.println("Clock : " + clock.systemDefaultZone());
		// Returns time based on system clock zone
		Clock defaultClock = Clock.systemDefaultZone();
		System.out.println("Clock : " + clock);

	}

}
