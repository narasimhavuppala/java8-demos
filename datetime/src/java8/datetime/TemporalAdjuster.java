package java8.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjuster {

	static DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");

	public static void main(String[] args) throws InterruptedException {
		// useTemporalAdjuster();
		

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



}
