package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_NoAutoCloseable {
  
  // tag::code[]
  static class Prateleira {}
  
  public static void main(String[] args) {
    try (Prateleira prateleira = new Prateleira()) { // NÃO COMPILA - Prateleira não implementa AutoClosable
      System.out.println("Olá");
    }
  }
  // end::code[]
}
