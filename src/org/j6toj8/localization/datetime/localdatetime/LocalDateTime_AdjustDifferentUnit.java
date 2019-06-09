package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_AdjustDifferentUnit {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDateTime = LocalDateTime.of(2019, 12, 31, 23, 59, 59);
    System.out.println(localDateTime);
    System.out.println(localDateTime.plusSeconds(2)); // + 2 segundos, vira o ano
    // end::code[]
  }
}
