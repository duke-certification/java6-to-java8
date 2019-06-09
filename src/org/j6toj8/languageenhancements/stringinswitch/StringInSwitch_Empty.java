package org.j6toj8.languageenhancements.stringinswitch;

public class StringInSwitch_Empty {

  // tag::code[]
  public static void main(String[] args) {
    
    String mes = "jan";
    switch (mes) {} // COMPILA - switch pode estar vazio, mesmo que seja inútil
  }
  // end::code[]
}
