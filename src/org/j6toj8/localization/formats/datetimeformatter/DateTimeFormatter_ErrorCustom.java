package org.j6toj8.localization.formats.datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_ErrorCustom {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate localDate = LocalDate.of(2019, 8, 6);
    LocalTime localTime = LocalTime.of(11, 40);
    LocalDateTime localDT = LocalDateTime.of(localDate, localTime);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH mm ss");

    System.out.println(localDT.format(formatter));
    System.out.println(localTime.format(formatter));
    System.out.println(localDate.format(formatter)); // lança exceção pois não possui campos de hora
    // end::code[]
  }
}
