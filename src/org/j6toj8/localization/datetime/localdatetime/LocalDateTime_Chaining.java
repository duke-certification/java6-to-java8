package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_Chaining {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDateTime = LocalDateTime.of(2019, 5, 20, 9, 20);
    System.out.println(localDateTime);
    System.out.println(localDateTime.plusDays(1).plusHours(1).plusYears(1));
    // end::code[]
  }
}
