package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_CloseException {
  
  // tag::code[]
  static class Porta implements AutoCloseable {
    @Override
    public void close() throws Exception { // declara throws Exception obrigatoriamente 
      throw new Exception();
    }
  }
  
  void try1() {
    try (Porta porta = new Porta()) { // NÃO COMPILA - exceção do close() não é capturada nem declarada
      System.out.println("Olá 1");
    }
  }
  
  void try2() {
    try (Porta porta = new Porta()) {
      System.out.println("Olá 2");
    } catch (Exception e) { // COMPILA - exceção capturada
    }
  }
  
  void try3() throws Exception { // COMPILA - exceção declarada no método
    try (Porta porta = new Porta()) {
      System.out.println("Olá 3");
    }
  }
  // end::code[]
}
