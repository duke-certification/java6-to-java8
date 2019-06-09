package org.j6toj8.localization.locale;

import java.io.IOException;
import java.util.Locale;

public class Locale_VarScriptExtension {

  // tag::code[]
  public static void main(String[] args) throws IOException { 
    Locale locale2 = new Locale.Builder() // az_AZ_#Latn
      .setLanguage("az")
      .setRegion("AZ")
      .setScript("Latn")
      .build();
    
    Locale locale3 = new Locale.Builder() // bs_BA_POSIX_#Latn_c-cc
      .setLanguage("bs")
      .setRegion("BA")
      .setVariant("POSIX")
      .setScript("Latn")
      .setExtension('c', "cc")
      .build();
  }
  // end::code[]
}
