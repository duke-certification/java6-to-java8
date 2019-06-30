package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_ExtendsNewMethod {

  // tag::code[]
  @FunctionalInterface
  interface Corredor { // interface funcional
    void corra(); // método funcional
  }
  
  interface Piloto extends Corredor {
    // NÃO é uma interface funcional, pois possui 2 métodos abstratos: corra (herdado) e pilote.
    void pilote();
  } 
  // end::code[]
}
