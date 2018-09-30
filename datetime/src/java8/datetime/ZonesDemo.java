package java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonesDemo {

	public static void main(String[] args) {

		Set<String> zones=ZoneId.getAvailableZoneIds();
		zones.forEach(System.out::println);
		
		ZoneId america = ZoneId.of("America/New_York");
		LocalDateTime localtDateAndTime = LocalDateTime.now();
		ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, america);
		System.out.println(dateAndTimeInNewYork);
		
		ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("Japan"));
		
		System.out.println(ny);
	}

}
