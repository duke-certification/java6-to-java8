package org.j6toj8.localization.formats.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormat_Parse {

  public static void main(String[] args) {
    // tag::code[]
    SimpleDateFormat simpleDateTime = new SimpleDateFormat("dd MM yy - HH mm ss");
    SimpleDateFormat simpleDate = new SimpleDateFormat("dd MM yy");
    SimpleDateFormat simpleTime = new SimpleDateFormat("HH mm ss");

    String dateTime = "08 09 01 - 22 46 40";
    String date = "08 09 01";
    String time = "22 46 40";

    try {
      System.out.println(simpleDateTime.parse(dateTime));
      System.out.println(simpleDate.parse(date));
      System.out.println(simpleTime.parse(time));
      System.out.println(simpleDateTime.parse(time)); // exceção, pois time não tem data
    } catch (ParseException e) {
      System.out.println(e.getMessage());
    }
    // end::code[]
  }
}
