package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_Basic {

  // tag::code[]
  @FunctionalInterface // a anotação não é obrigatória
  interface Executavel { // interface funcional
    void execute(); // método funcional
  }
  // end::code[]
}
