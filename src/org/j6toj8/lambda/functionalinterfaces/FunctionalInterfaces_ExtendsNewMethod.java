package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_ExtendsNewMethod {

  // tag::code[]
  @FunctionalInterface
  interface Executavel { // interface funcional
    void execute(); // método funcional
  }
  
  interface Aplicacao extends Executavel {
    // NÃO é uma interface funcional, pois possui 2 métodos abstratos: execute (herdado) e inicie.
    void inicie();
  } 
  // end::code[]
}
