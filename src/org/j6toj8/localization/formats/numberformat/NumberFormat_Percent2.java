package org.j6toj8.localization.formats.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat_Percent2 {

  public static void main(String[] args) {
    // tag::code[]
    NumberFormat percentFormatPtBR = NumberFormat.getPercentInstance(new Locale("pt", "BR"));
    NumberFormat percentFormatEnUS = NumberFormat.getPercentInstance(new Locale("en", "US"));

    // String para Percentual
    String s = "80,2%";

    try {
      System.out.println("pt_BR: " + percentFormatPtBR.parse(s));
      System.out.println("en_US: " + percentFormatEnUS.parse(s));
    } catch (ParseException e) {
      // trate a exceção de parse
    }
    // end::code[]
  }
}
