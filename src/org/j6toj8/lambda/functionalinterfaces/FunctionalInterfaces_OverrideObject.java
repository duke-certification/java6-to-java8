package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_OverrideObject {

  // tag::code[]
  @FunctionalInterface
  interface Corredor { // interface funcional
    void corra(); // método funcional

    // sobrescrevendo métodos de Object
    @Override
    String toString();
    @Override
    boolean equals(Object obj);
    @Override
    int hashCode();
  }
  // end::code[]
}
