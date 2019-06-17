package org.j6toj8.localization.formats.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_NumberToString {

  public static void main(String[] args) {
    // tag::code[]
    NumberFormat numberFormatPtBR = NumberFormat.getInstance(new Locale("pt", "BR"));
    NumberFormat numberFormatEnUS = NumberFormat.getInstance(new Locale("en", "US"));
    NumberFormat numberFormatFrFR = NumberFormat.getInstance(new Locale("fr", "FR"));

    double d = 1000.05;

    System.out.println("pt_BR: " + numberFormatPtBR.format(d));
    System.out.println("en_US: " + numberFormatEnUS.format(d));
    System.out.println("fr_FR: " + numberFormatFrFR.format(d));
    // end::code[]
  }
}
