package java8.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OldDateTime {
	static DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
	public static void main(String[] args) {

		Date date = new Date(115, 3, 18);
		System.out.println(date);
		System.out.println(df.format(date));

		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, Calendar.AUGUST, 18);
		System.out.println(calendar.getTime());

	}

}
