package org.j6toj8.localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_JavaBundle {

  public static void main(String[] args) {

    // tag::code[]
    ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("fr", "CA")); 
    System.out.println(bundle.getString("glass"));
    // end::code[]

  }
}
