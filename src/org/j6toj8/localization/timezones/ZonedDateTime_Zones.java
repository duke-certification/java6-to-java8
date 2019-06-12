package org.j6toj8.localization.timezones;

import java.time.ZoneId;
import java.util.Set;

public class ZonedDateTime_Zones {

  public static void main(String[] args) {
    // tag::code[]
	Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
	for (String zoneId : availableZoneIds) {
		System.out.println(zoneId);
	}
    // end::code[]
  }
}
