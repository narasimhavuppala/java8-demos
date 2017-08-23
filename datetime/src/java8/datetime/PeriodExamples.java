package java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExamples {

	public static void main(String[] args) {

		Period tenDays = Period.ofDays(10);
		System.out.println(tenDays.getDays());

		Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
		System.out.println(oneYearTwoMonthsThreeDays.getYears());

		
		LocalDate oldDate = LocalDate.of(1982, Month.AUGUST, 31);
		LocalDate newDate = LocalDate.of(2016, Month.NOVEMBER, 9);


		// check period between dates
		Period period = Period.between(oldDate, newDate);

		System.out.print(period.getYears() + " years,");
		System.out.print(period.getMonths() + " months,");
		System.out.print(period.getDays() + " days");
	}

}
