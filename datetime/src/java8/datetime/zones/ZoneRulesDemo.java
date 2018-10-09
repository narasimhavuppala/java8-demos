package java8.datetime.zones;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

public class ZoneRulesDemo {

	public static void main(String[] args) {
		
		System.out.println(ZoneRules.of(ZoneOffset.of("+02:00")).isDaylightSavings(Instant.now()));
		System.out.println(ZoneRules.of(ZoneOffset.of("+02:00")).isFixedOffset());

	}

}
