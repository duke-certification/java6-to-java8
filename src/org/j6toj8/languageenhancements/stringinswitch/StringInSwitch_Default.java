package org.j6toj8.languageenhancements.stringinswitch;

public class StringInSwitch_Default {

  // tag::code[]
  public static void main(String[] args) {
    
    String mes = "jan";
    
    switch (mes) {
    case "jan":
      System.out.println("Janeiro");
      break;
    default: // COMPILA - O default pode estar em qualquer posição
      break;
    case "jan": // NÃO COMPILA - Já existe o case "jan"
      System.out.println("Janeiro2");
      break;
    case "mar":
      System.out.println("Março");
      break;
    }
  }
  // end::code[]
}
