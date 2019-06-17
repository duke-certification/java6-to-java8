package org.j6toj8.localization.formats.dateformat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat_Instance {

  public static void main(String[] args) {
    // tag::code[]
    DateFormat dateInstance = DateFormat.getDateInstance();
    DateFormat timeInstance = DateFormat.getTimeInstance();
    DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
    DateFormat dateTimeLongInstance = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
    DateFormat dateTimeUSInstance = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.US);

    Date date = new Date(1000000000000L); // data em quantidade de milissegundos desde 01/01/1970

    System.out.println(dateInstance.format(date));
    System.out.println(timeInstance.format(date));
    System.out.println(dateTimeInstance.format(date));
    System.out.println(dateTimeLongInstance.format(date));
    System.out.println(dateTimeUSInstance.format(date));
    // end::code[]
  }
}
