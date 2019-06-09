package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_ResourceInsideTry {
  
  // tag::code[]
  static class Porta implements AutoCloseable {
    @Override
    public void close() { // chamado automaticamente pelo try-with-resources
      System.out.println("Porta fechada.");
    }
  }
  
  public static void main(String[] args) {
    try (Porta porta = new Porta()) {
      porta.toString();
    } catch (Exception e) {
      porta.toString(); // NÃO COMPILA - variável porta só disponível dentro do bloco try
    } finally {
      porta.toString(); // NÃO COMPILA - variável porta só disponível dentro do bloco try
    }
  }
  // end::code[]
}
