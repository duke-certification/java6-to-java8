package org.j6toj8.localization.formats.datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Error {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate localDate = LocalDate.of(2019, 8, 6);
    LocalTime localTime = LocalTime.of(11, 40);
    LocalDateTime localDT = LocalDateTime.of(localDate, localTime);

    System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
    System.out.println(localDT.format(DateTimeFormatter.ISO_LOCAL_DATE));

    // lança exceção pois não possui campos de data
    System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
    // end::code[]
  }
}
