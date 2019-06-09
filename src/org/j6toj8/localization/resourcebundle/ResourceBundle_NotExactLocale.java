package org.j6toj8.localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_NotExactLocale {

  public static void main(String[] args) {

    // tag::code[]
    Locale.setDefault(new Locale("pt", "BR")); // pt_BR como Locale padrão
    ResourceBundle bundle2 = ResourceBundle.getBundle("Text", new Locale("zh", "CN"));
    System.out.println(bundle2.getLocale()); // Bundle localizado para o Locale "zh_CH" (Chinês simplificado)
    ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("it", "CH"));
    System.out.println(bundle.getLocale()); // Bundle localizado para o Locale "it_CH" (Italiano da Suíça)
    // end::code[]

  }
}
