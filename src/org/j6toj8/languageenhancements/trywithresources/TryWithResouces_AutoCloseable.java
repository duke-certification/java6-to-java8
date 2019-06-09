package org.j6toj8.languageenhancements.trywithresources;

import java.io.FileNotFoundException;

public class TryWithResouces_AutoCloseable {
  
  // tag::code[]
  static class Porta implements AutoCloseable {
    @Override
    public void close() { // chamado automaticamente pelo try-with-resources
      System.out.println("Porta fechada.");
    }
  }
  
  public static void main(String[] args) throws FileNotFoundException {
    try (Porta porta = new Porta()) { // Porta instanciada dentro da instrução try-with-resources
      System.out.println("try");
    }
  }
  // end::code[]
}
