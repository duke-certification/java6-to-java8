package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_Implement {

  // tag::code[]
  @FunctionalInterface
  interface Executavel { // interface funcional
    String execute(); // método funcional
  }
  
  class Pessoa implements Executavel {
    // COMPILA!
    // interfaces funcionais, como Corredor, não foram feitas para serem implementadas dessa forma
    // porém é possível e o código compila normalmente
    @Override
    public String execute() {
      return "Executando";
    }
  }
  // end::code[]
  
}
