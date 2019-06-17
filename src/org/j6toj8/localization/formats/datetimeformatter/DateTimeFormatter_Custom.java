package org.j6toj8.localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Custom {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDT = LocalDateTime.of(2019, 8, 6, 11, 40);

    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd MM yy - HH mm ss");

    System.out.println(localDT.format(customFormatter));
    // end::code[]
  }
}
