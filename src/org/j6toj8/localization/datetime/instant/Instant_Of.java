package org.j6toj8.localization.datetime.instant;

import java.time.Instant;

public class Instant_Of {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(Instant.ofEpochMilli(1000000000000L));
    System.out.println(Instant.ofEpochSecond(1000000000));
    System.out.println(Instant.ofEpochSecond(1000000000, 123000000)); // com nanossegundos
    // end::code[]
  }
}
