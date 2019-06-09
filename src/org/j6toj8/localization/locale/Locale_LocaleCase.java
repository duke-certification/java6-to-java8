package org.j6toj8.localization.locale;

import java.io.IOException;
import java.util.Locale;

public class Locale_LocaleCase {

  // tag::code[]
  public static void main(String[] args) throws IOException {
    System.out.println(new Locale("PT", "br"));
    
    System.out.println(Locale.forLanguageTag("PT-br"));
    
    Locale localePtBR = new Locale.Builder()
      .setLanguage("PT")
      .setRegion("br")
      .build();
    
    System.out.println(localePtBR);
  }
  // end::code[]
}
