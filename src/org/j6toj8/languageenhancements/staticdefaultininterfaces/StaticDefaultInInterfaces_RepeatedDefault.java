package org.j6toj8.languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_RepeatedDefault {

  // tag::code[]
  interface Corredor {
    default String correr() {
      return "Correndo";
    }
  }
  
  interface Piloto {
    default String correr() {
      return "Piloto Correndo";
    }
  }
  
  static class Pessoa implements Corredor, Piloto { // NÃO COMPILA - implementa duas interfaces com métodos repetidos e não sobrescreve
    
  }
  
  static class Gigante implements Corredor, Piloto { // COMPILA - implementa duas interfaces com métodos repetidos, mas sobrescreve e cria sua própria implementação
    @Override
    public String correr() {
      return "Gigante Correndo";
    }
  }
  // end::code[]
}
