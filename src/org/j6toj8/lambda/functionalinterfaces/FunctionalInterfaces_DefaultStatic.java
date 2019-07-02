package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_DefaultStatic {

  // tag::code[]
  @FunctionalInterface
  interface Executavel { // interface funcional
    void execute(); // método funcional

    // métodos adicionais static são permitidos
    static void execute(Executavel... executaveis) {
      for (Executavel executavel : executaveis) {
        executavel.execute();
      }
    }

    // métodos adicionais default são permitidos
    default void executeDuasVezes() {
      execute();
      execute();
    }
  }
  // end::code[]
}
