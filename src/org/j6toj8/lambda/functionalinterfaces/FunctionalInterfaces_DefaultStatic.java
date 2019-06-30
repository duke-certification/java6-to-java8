package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_DefaultStatic {

  // tag::code[]
  @FunctionalInterface
  interface Corredor { // interface funcional
    void corra(); // método funcional

    // métodos adicionais static são permitidos
    static void corram(Corredor... corredores) {
      for (Corredor corredor : corredores) {
        corredor.corra();
      }
    }

    // métodos adicionais default são permitidos
    default String pule() {
      return "Corredor pulando";
    }
  }
  // end::code[]
}
