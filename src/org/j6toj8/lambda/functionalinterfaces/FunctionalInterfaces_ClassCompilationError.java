package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_ClassCompilationError {

  // tag::code[]
  @FunctionalInterface
  interface Corredor { // interface funcional
    void corra(); // método funcional
  }
  
  @FunctionalInterface
  class Piloto implements Corredor { // NÃO COMPILA!
    // apenas interfaces podem ser anotadas com @FunctionalInterface
  } 
  // end::code[]
}
