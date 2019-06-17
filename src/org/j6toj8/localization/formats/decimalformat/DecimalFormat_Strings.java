package org.j6toj8.localization.formats.decimalformat;

import java.text.DecimalFormat;

public class DecimalFormat_Strings {

  public static void main(String[] args) {
    // tag::code[]
    double d = 12345.67;

    DecimalFormat decimalFormat = new DecimalFormat("Número ###,###.### formatado");
    System.out.println(decimalFormat.format(d));
    // end::code[]
  }
}
