package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_Invalid {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(LocalDateTime.of(2019, 4, 31, 9, 20)); // lança exceção: não existe 31 de abril
    // end::code[]
  }
}
