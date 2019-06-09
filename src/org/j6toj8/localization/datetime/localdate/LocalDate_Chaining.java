package org.j6toj8.localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_Chaining {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate localDate = LocalDate.of(2019, Month.MAY, 20);
    System.out.println(localDate);
    System.out.println(localDate.plusDays(1).plusMonths(1).plusYears(1));
    // end::code[]
  }
}
