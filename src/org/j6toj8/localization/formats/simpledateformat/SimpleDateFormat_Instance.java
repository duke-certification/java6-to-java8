package org.j6toj8.localization.formats.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_Instance {

  public static void main(String[] args) {
    // tag::code[]
    SimpleDateFormat simpleDateTime = new SimpleDateFormat("dd MM yy - HH mm ss");
    SimpleDateFormat simpleDate = new SimpleDateFormat("dd MM yy");
    SimpleDateFormat simpleTime = new SimpleDateFormat("HH mm ss");

    Date date = new Date(1000000000000L); // data em quantidade de milissegundos desde 01/01/1970

    System.out.println(simpleDateTime.format(date));
    System.out.println(simpleDate.format(date));
    System.out.println(simpleTime.format(date));
    // end::code[]
  }
}
