package org.j6toj8.languageenhancements.trywithresources;

import java.io.FileNotFoundException;

public class TryWithResouces_WithCatchFinally {
  
  // tag::code[]
  static class Porta implements AutoCloseable {
    @Override
    public void close() throws Exception { // chamado automaticamente pelo try-with-resources
      System.out.println("Porta fechada.");
      throw new Exception(); // lança Exception
    }
  }
  
  public static void main(String[] args) throws FileNotFoundException {
    try (Porta porta = new Porta()) { // Porta instanciada dentro da instrução try-with-resources
      System.out.println("try");
    } catch (Exception e) {
      System.out.println("catch");
    } finally {
      System.out.println("finally");
    }
  }
  // end::code[]
}
