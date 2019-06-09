package org.j6toj8.localization.datetime.instant;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Instant_Convert {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDateTime = LocalDateTime.of(2019, 5, 27, 13, 1, 1);
    System.out.println("LocalDateTime: " + localDateTime);
    System.out.println(localDateTime.toInstant(ZoneOffset.UTC));
    System.out.println(localDateTime.toInstant(ZoneOffset.of("-3")));
    
    Instant instant = Instant.ofEpochSecond(1558962061L); // mesma data do localDateTime
    System.out.println("\nInstant: " + instant);
    System.out.println(LocalDateTime.ofInstant(instant, ZoneOffset.UTC));
    System.out.println(LocalDateTime.ofInstant(instant, ZoneOffset.of("-3")));
    // end::code[]
  }
}
