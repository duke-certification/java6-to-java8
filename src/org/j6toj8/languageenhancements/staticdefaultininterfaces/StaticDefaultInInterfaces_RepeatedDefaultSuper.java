package org.j6toj8.languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_RepeatedDefaultSuper {

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
  
  static class Pessoa implements Corredor, Piloto { // COMPILA - mantém a implementação do Corredor no método correr()
    @Override
    public String correr() {
      return Corredor.super.correr();
    }
    
    public static void main(String[] args) {
      System.out.println(new Pessoa().correr());
    }
  }
  // end::code[]
}
