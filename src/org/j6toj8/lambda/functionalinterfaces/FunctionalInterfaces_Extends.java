package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_Extends {

  // tag::code[]
  @FunctionalInterface
  interface Executavel { // interface funcional
    void execute(); // método funcional
  }
  
  @FunctionalInterface
  interface Aplicacao extends Executavel {
    // também é uma interface funcional
  } 
  // end::code[]
}
