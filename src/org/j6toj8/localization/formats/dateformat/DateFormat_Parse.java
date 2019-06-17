package org.j6toj8.localization.formats.dateformat;

import java.text.DateFormat;
import java.text.ParseException;

public class DateFormat_Parse {

  public static void main(String[] args) {
    // tag::code[]
    DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.SHORT);
    DateFormat timeInstance = DateFormat.getTimeInstance(DateFormat.SHORT);
    DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

    String date = "08/09/2001";
    String time = "22:46:40";
    String dateTime = "08/09/2001 22:46:40";

    try {
      System.out.println(dateInstance.parse(date));
      System.out.println(timeInstance.parse(time));
      System.out.println(dateTimeInstance.parse(dateTime));
      System.out.println(dateTimeInstance.parse(date)); // exceção, pois date não tem hora
    } catch (ParseException e) {
      System.out.println(e.getMessage());
    }
    // end::code[]
  }
}
