package org.j6toj8.localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatter_Parse {

  public static void main(String[] args) {
    // tag::code[]
    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd MM yy - HH mm ss");
    DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

    LocalDateTime parseCustom = LocalDateTime.parse("06 08 19 - 11 40 00", customFormatter);
    LocalDateTime parseIso = LocalDateTime.parse("2019-08-06T11:40:00", isoFormatter);
    LocalDateTime parseShort = LocalDateTime.parse("06/08/19 11:40", shortFormatter);

    System.out.println(parseCustom);
    System.out.println(parseIso);
    System.out.println(parseShort);
    // end::code[]
  }
}
