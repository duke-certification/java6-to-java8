package org.j6toj8.localization.locale;

import java.io.IOException;
import java.util.Locale;

public class Locale_LocaleLanguageOnly {

  // tag::code[]
  public static void main(String[] args) throws IOException {
    System.out.println(new Locale("pt")); // português
    System.out.println(new Locale("en")); // inglês
    System.out.println(new Locale("es")); // espanhol
    System.out.println(new Locale("fr")); // francês
  }
  // end::code[]
}
