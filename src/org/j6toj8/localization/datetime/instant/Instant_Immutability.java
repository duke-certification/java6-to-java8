package org.j6toj8.localization.datetime.instant;

import java.time.Instant;

public class Instant_Immutability {

  public static void main(String[] args) {
    // tag::code[]
    Instant instant = Instant.ofEpochMilli(1000000000000L);
    System.out.println(instant);
    instant.plusSeconds(60); // chamada perdida - a nova data/hora não foi armazenada em uma variável
    System.out.println(instant);
    instant = instant.plusSeconds(60); // chamada útil - data/hora armazenada na variável
    System.out.println(instant);
    // end::code[]
  }
}
