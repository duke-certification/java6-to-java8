package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_Order {
  
  // tag::code[]
  static class Porta implements AutoCloseable {
    @Override
    public void close() { // chamado automaticamente pelo try-with-resources
      System.out.println("Porta fechada.");
    }
  }
  
  static class Gaveta implements AutoCloseable {
    @Override
    public void close() { // chamado automaticamente pelo try-with-resources
      System.out.println("Gaveta fechada.");
    }
  }

  public static void main(String[] args) {
    try (Porta porta = new Porta();
      Gaveta gaveta = new Gaveta()) {
      System.out.println("Olá.");
    }
  }
  // end::code[]
}
