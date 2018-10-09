package java8.datetime.local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

	public static void main(String[] args) {
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

	}

}
