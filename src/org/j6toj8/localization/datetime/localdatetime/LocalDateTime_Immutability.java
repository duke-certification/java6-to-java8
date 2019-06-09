package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_Immutability {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDateTime = LocalDateTime.of(2019, 5, 20, 9, 20);
    System.out.println(localDateTime);
    localDateTime.plusHours(1); // chamada perdida - a nova data/hora não foi armazenada em uma variável
    System.out.println(localDateTime);
    localDateTime = localDateTime.plusHours(1); // chamada útil - data/hora armazenada na variável
    System.out.println(localDateTime);
    // end::code[]
  }
}
