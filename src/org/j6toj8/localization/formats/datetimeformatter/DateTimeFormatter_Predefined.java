package org.j6toj8.localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Predefined {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDT = LocalDateTime.of(2019, 8, 6, 11, 40);
    System.out.println(localDT.format(DateTimeFormatter.ISO_LOCAL_DATE));
    System.out.println(localDT.format(DateTimeFormatter.ISO_LOCAL_TIME));
    System.out.println(localDT.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    System.out.println(localDT.format(DateTimeFormatter.ISO_ORDINAL_DATE));
    System.out.println(localDT.format(DateTimeFormatter.ISO_WEEK_DATE));
    // end::code[]
  }
}
