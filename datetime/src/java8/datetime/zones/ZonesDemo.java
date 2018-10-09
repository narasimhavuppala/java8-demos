package java8.datetime.zones;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonesDemo {

	public static void main(String[] args) {

		Set<String> zones = ZoneId.getAvailableZoneIds();
		zones.stream().filter(x -> x.contains("Asia")).forEach(System.out::println);

		ZoneId zoneId = ZoneId.of("Asia/Calcutta");
		ZonedDateTime zonedTime = ZonedDateTime.now(zoneId);
		System.out.println(zonedTime);
	}

}
