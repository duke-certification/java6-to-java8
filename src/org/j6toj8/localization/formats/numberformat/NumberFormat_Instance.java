package org.j6toj8.localization.formats.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_Instance {

  public static void main(String[] args) {
    // tag::code[]
    // sem Locale
    NumberFormat instance1 = NumberFormat.getInstance();
    NumberFormat instance2 = NumberFormat.getNumberInstance(); // igual a getInstance()
    NumberFormat instance3 = NumberFormat.getCurrencyInstance();
    NumberFormat instance4 = NumberFormat.getPercentInstance();

    // com Locale
    NumberFormat instance5 = NumberFormat.getInstance(new Locale("pt", "BR"));
    NumberFormat instance6 = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
    NumberFormat instance7 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    NumberFormat instance8 = NumberFormat.getPercentInstance(new Locale("pt", "BR"));
    // end::code[]
  }
}
