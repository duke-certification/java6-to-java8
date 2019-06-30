package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_Extends {

  // tag::code[]
  @FunctionalInterface
  interface Corredor { // interface funcional
    void corra(); // método funcional
  }
  
  @FunctionalInterface
  interface Piloto extends Corredor {
    // também é uma interface funcional
  } 
  // end::code[]
}
