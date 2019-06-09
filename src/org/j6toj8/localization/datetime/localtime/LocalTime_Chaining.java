package org.j6toj8.localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_Chaining {

  public static void main(String[] args) {
    // tag::code[]
    LocalTime localTime = LocalTime.of(9, 32, 5);
    System.out.println(localTime);
    System.out.println(localTime.plusHours(1).plusMinutes(1).plusSeconds(1).plusNanos(1000000));
    // end::code[]
  }
}
