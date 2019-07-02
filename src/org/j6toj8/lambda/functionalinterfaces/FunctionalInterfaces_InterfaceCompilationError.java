package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_InterfaceCompilationError {

  // tag::code[]
  @FunctionalInterface
  interface Executavel { // interface funcional
    void execute(); // método funcional
  }
  
  @FunctionalInterface
  interface Aplicacao extends Executavel { // NÃO COMPILA!
    // não pode ser anotada como funcional, pois possui 2 métodos abstratos
    void inicie();
  } 
  // end::code[]
}
