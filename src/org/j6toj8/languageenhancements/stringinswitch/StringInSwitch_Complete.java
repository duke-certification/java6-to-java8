package org.j6toj8.languageenhancements.stringinswitch;

public class StringInSwitch_Complete {

  // tag::code[]
  public static void main(String[] args) {
    
    String mes = "jan";
    
    switch (mes) {
    case "jan":
      System.out.println("Janeiro");
      break;
    case "fev":
      System.out.println("Fevereiro");
      break;
    case "mar":
      System.out.println("Março");
      break;
    default:
      break;
    }
  }
  // end::code[]
}
