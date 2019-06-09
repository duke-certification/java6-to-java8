package org.j6toj8.localization.locale;

import java.io.IOException;
import java.util.Locale;

public class Locale_LocaleLanguageCountry {

  public static void main(String[] args) throws IOException {
    // tag::code[]
    new Locale("pt", "BR"); // Português do Brasil
    new Locale("en", "US"); // Inglês dos EUA
    new Locale("it", "CH"); // Italiano da Suíça
    new Locale("fr", "BE"); // Francês da Bélgica
    // end::code[]
  }
}
