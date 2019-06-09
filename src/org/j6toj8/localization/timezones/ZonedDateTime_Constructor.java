package org.j6toj8.localization.timezones;

import java.time.ZonedDateTime;

public class ZonedDateTime_Constructor {

  public static void main(String[] args) {
    // tag::code[]
	ZonedDateTime zonedDateTime = new ZonedDateTime(); // NÃO COMPILA! - não possui construtor público
    System.out.println(zonedDateTime);
    // end::code[]
  }
}
