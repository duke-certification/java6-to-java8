package org.j6toj8.localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_Invalid {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(LocalTime.of(24, 2, 3)); // lança exceção: a hora deve estar entre 0 e 23
    // end::code[]
  }
}
