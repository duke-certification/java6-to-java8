package org.j6toj8.localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatter_Inverted {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDT = LocalDateTime.of(2019, 8, 6, 11, 40);
    System.out.println(localDT);

    String format = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDT);
    System.out.println(format);

    TemporalAccessor parse = DateTimeFormatter.ISO_LOCAL_DATE_TIME.parse(format);
    System.out.println(parse);
    System.out.println(LocalDateTime.from(parse));
    // end::code[]
  }
}
