package org.j6toj8.localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatter_FormatStyle {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDT = LocalDateTime.of(2019, 8, 6, 11, 40);

    DateTimeFormatter dateTimeShortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    DateTimeFormatter dateTimeMediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    DateTimeFormatter dateShortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter timeShortFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

    System.out.println(localDT.format(dateTimeShortFormatter));
    System.out.println(localDT.format(dateTimeMediumFormatter));
    System.out.println(localDT.format(dateShortFormatter));
    System.out.println(localDT.format(timeShortFormatter));
    // end::code[]
  }
}
