package org.j6toj8.localization.formats.decimalformat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormat_Locale {

  public static void main(String[] args) {
    // tag::code[]
    double d = 12345.67;

    NumberFormat numberFormatUS = NumberFormat.getNumberInstance(Locale.US);
    DecimalFormat decimalFormatUS = (DecimalFormat) numberFormatUS;
    decimalFormatUS.applyLocalizedPattern("###,###.###");
    System.out.println(decimalFormatUS.format(d));
    // end::code[]
  }
}
