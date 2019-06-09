package org.j6toj8.localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_Immutability {

  public static void main(String[] args) {
    // tag::code[]
    ZonedDateTime zonedDateTime = ZonedDateTime.of(2019, 5, 20, 9, 20, 3, 300, ZoneId.of("America/Sao_Paulo"));
    System.out.println(zonedDateTime);
    zonedDateTime.plusHours(1); // chamada perdida - a nova data/hora não foi armazenada em uma variável
    System.out.println(zonedDateTime);
    zonedDateTime = zonedDateTime.plusHours(1); // chamada útil - data/hora armazenada na variável
    System.out.println(zonedDateTime);
    // end::code[]
  }
}
