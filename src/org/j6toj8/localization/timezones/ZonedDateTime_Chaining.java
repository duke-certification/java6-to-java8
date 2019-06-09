package org.j6toj8.localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_Chaining {

  public static void main(String[] args) {
    // tag::code[]
    ZonedDateTime zonedDateTime = ZonedDateTime.of(2019, 5, 20, 9, 20, 4, 300, ZoneId.of("America/Sao_Paulo"));
    System.out.println(zonedDateTime);
    System.out.println(zonedDateTime.plusDays(1).plusHours(1).plusYears(1));
    // end::code[]
  }
}
