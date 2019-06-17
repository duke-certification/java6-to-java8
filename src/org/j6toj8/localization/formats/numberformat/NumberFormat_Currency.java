package org.j6toj8.localization.formats.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat_Currency {

  public static void main(String[] args) {
    // tag::code[]
    NumberFormat currencyFormatPtBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    NumberFormat currencyFormatEnUS = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
    NumberFormat currencyFormatFrFR = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));

    // Valor monetário para String
    double d = 1000.05;

    System.out.println("pt_BR: " + currencyFormatPtBR.format(d));
    System.out.println("en_US: " + currencyFormatEnUS.format(d));
    System.out.println("fr_FR: " + currencyFormatFrFR.format(d));

    // String para valor Monetário
    String s = "R$ 1000,05";

    try {
      System.out.println("pt_BR: " + currencyFormatPtBR.parse(s));
    } catch (ParseException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println("en_US: " + currencyFormatEnUS.parse(s));
    } catch (ParseException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println("fr_FR: " + currencyFormatFrFR.parse(s));
    } catch (ParseException e) {
      System.out.println(e.getMessage());
    }
    // end::code[]
  }
}
