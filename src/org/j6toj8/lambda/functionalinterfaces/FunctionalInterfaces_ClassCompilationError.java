package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_ClassCompilationError {

  // tag::code[]
  @FunctionalInterface
  interface Executavel { // interface funcional
    void execute(); // método funcional
  }
  
  @FunctionalInterface
  class Piloto { // NÃO COMPILA!
    // apenas interfaces podem ser anotadas com @FunctionalInterface
  } 
  // end::code[]
}
