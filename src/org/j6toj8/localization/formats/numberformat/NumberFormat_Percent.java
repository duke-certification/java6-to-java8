package org.j6toj8.localization.formats.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat_Percent {

  public static void main(String[] args) {
    // tag::code[]
    NumberFormat percentFormatPtBR = NumberFormat.getPercentInstance(new Locale("pt", "BR"));
    NumberFormat percentFormatEnUS = NumberFormat.getPercentInstance(new Locale("en", "US"));
    NumberFormat percentFormatFrFR = NumberFormat.getPercentInstance(new Locale("fr", "FR"));

    // Percentual para String
    double d = 0.9;

    System.out.println("pt_BR: " + percentFormatPtBR.format(d));
    System.out.println("en_US: " + percentFormatEnUS.format(d));
    System.out.println("fr_FR: " + percentFormatFrFR.format(d));

    // String para Percentual
    String s = "80%";

    try {
      System.out.println("pt_BR: " + percentFormatPtBR.parse(s));
      System.out.println("en_US: " + percentFormatEnUS.parse(s));
      System.out.println("fr_FR: " + percentFormatFrFR.parse(s));
    } catch (ParseException e) {
      System.out.println(e.getMessage());
    }
    // end::code[]
  }
}
