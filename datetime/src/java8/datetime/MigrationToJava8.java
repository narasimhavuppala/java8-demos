package java8.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MigrationToJava8 {

	public static void main(String[] args) {
		Instant instantFromCalendar = GregorianCalendar.getInstance().toInstant();
		
		ZonedDateTime zonedDateTimeFromCalendar = new GregorianCalendar().toZonedDateTime();
		
		Date dateFromInstant = Date.from(Instant.now());
		
		GregorianCalendar calendarFromZonedDateTime = GregorianCalendar.from(ZonedDateTime.now());
		
		Instant instantFromDate = new Date().toInstant();
		
		ZoneId zoneIdFromTimeZone = TimeZone.getTimeZone("PST").toZoneId();
	}

}
