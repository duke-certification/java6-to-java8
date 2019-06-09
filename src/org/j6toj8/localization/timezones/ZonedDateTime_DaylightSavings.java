package org.j6toj8.localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_DaylightSavings {

  public static void main(String[] args) {
    // tag::code[]
    ZonedDateTime zonedDateTime = ZonedDateTime.of(2018, 11, 3, 23, 30, 0, 0, ZoneId.of("America/Sao_Paulo"));
    System.out.println(zonedDateTime);
    System.out.println("+2 horas: " + zonedDateTime.plusHours(2));
    // end::code[]
  }
}
