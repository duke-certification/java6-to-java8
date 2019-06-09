package org.j6toj8.localization.locale;

import java.io.IOException;
import java.util.Locale;

public class Locale_LocaleDefault {

  // tag::code[]
  public static void main(String[] args) throws IOException {
    System.out.println(Locale.getDefault()); // o padrão inicial muda de acordo com seu dispositivo
    Locale.setDefault(Locale.KOREA); // altera o Locale default
    System.out.println(Locale.getDefault()); // ko_KR
  }
  // end::code[]
}
