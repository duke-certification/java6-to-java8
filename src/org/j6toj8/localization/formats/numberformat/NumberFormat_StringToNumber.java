package org.j6toj8.localization.formats.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat_StringToNumber {

  public static void main(String[] args) {
    // tag::code[]
    NumberFormat numberFormatPtBR = NumberFormat.getInstance(new Locale("pt", "BR"));
    NumberFormat numberFormatEnUS = NumberFormat.getInstance(new Locale("en", "US"));
    NumberFormat numberFormatFrFR = NumberFormat.getInstance(new Locale("fr", "FR"));

    String s = "1000,05";

    try {
      Number parsePtBR = numberFormatPtBR.parse(s);
      Number parseEnUS = numberFormatEnUS.parse(s);
      Number parseFrFR = numberFormatFrFR.parse(s);

      System.out.println("pt_BR: " + parsePtBR);
      System.out.println("en_US: " + parseEnUS);
      System.out.println("fr_FR: " + parseFrFR);
    } catch (ParseException e) {
      // trate a exceção no parse
    }
    // end::code[]
  }
}
