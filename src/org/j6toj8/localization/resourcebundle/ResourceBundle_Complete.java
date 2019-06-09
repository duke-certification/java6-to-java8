package org.j6toj8.localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundle_Complete {

  // tag::code[]
  public static void main(String[] args) {

    Locale.setDefault(new Locale("en", "US"));
    
    System.out.println("\n -- Locale padrão (en_US) -- ");
    ResourceBundle bundleDefault = ResourceBundle.getBundle("Text");
    Set<String> keySetDefault = bundleDefault.keySet();
    for (String string : keySetDefault) {
      System.out.println(string + " - " + bundleDefault.getString(string));
    }    
    
    System.out.println("\n -- Locale es_ES -- ");
    ResourceBundle bundleEsEs = ResourceBundle.getBundle("Text", new Locale("es", "ES"));
    Set<String> keySetEsEs = bundleEsEs.keySet();
    for (String string : keySetEsEs) {
      System.out.println(string + " - " + bundleEsEs.getString(string));
    }
    
    System.out.println("\n -- Locale pt_BR -- ");
    ResourceBundle bundlePtBr = ResourceBundle.getBundle("Text", new Locale("pt", "BR"));
    Set<String> keySetPtBr = bundlePtBr.keySet();
    for (String string : keySetPtBr) {
      System.out.println(string + " - " + bundlePtBr.getString(string));
    }

  }
  // end::code[]
}
