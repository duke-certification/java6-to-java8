package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTime_Of {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(LocalDateTime.of(LocalDate.of(2019, 5, 20), LocalTime.of(9, 20, 12)));
    System.out.println(LocalDateTime.of(2019, 5, 20, 9, 20));
    System.out.println(LocalDateTime.of(2019, Month.MAY, 20, 9, 20));
    System.out.println(LocalDateTime.of(2019, 5, 20, 9, 20, 12));
    System.out.println(LocalDateTime.of(2019, Month.MAY, 20, 9, 20, 12));
    System.out.println(LocalDateTime.of(2019, 5, 20, 9, 20, 12, 135));
    System.out.println(LocalDateTime.of(2019, Month.MAY, 20, 9, 20, 12, 135));
    // end::code[]
  }
}
