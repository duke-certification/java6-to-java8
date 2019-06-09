package org.j6toj8.localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_Inheritance {

  public static void main(String[] args) {

    // tag::code[]
    Locale.setDefault(new Locale("en", "US")); // pt_BR como Locale padrão
    ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("pt", "BR"));
    System.out.println("Locale: " + bundle.getLocale()); // Bundle localizado para o Locale "pt_BR" (Português do Brasil)
    System.out.println(bundle.getObject("pen"));
    System.out.println(bundle.getObject("paper"));
    System.out.println(bundle.getObject("keyboard"));
    // end::code[]

  }
}
