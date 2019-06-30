package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_InterfaceCompilationError {

  // tag::code[]
  @FunctionalInterface
  interface Corredor { // interface funcional
    void corra(); // método funcional
  }
  
  @FunctionalInterface
  interface Piloto extends Corredor { // NÃO COMPILA!
    // não pode ser anotada como funcional, pois possui 2 métodos abstratos
    void pilote();
  } 
  // end::code[]
}
