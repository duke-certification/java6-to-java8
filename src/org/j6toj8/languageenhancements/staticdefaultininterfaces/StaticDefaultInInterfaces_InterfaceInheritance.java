package org.j6toj8.languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_InterfaceInheritance {

  // tag::code[]
  interface Corredor {
    default String correr() {
      return "Correndo";
    }
    default String correrRapido() {
      return "Correndo Rápido";
    }
    default String correrDevagar() {
      return "Correndo Devagar";
    }
  }
  
  interface Piloto extends Corredor {
    String correrRapido();
    
    default String correrDevagar() {
      return "Piloto Correndo Devagar";
    }
  }
  // end::code[]
}
