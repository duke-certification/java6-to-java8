package org.j6toj8.languageenhancements.staticdefaultininterfaces;

import java.io.IOException;

public class StaticDefaultInInterfaces_Abstract {

  // tag::code[]
  interface Corredor {
    default String correr() { // COMPILA - método default não é abstract
      return "Correndo";
    }
    
    abstract default String correrRapido() { // NÃO COMPILA - método default não pode ser declarado abstract
      return "Correndo Rápido";
    }
    
    String correrDevagar(); // COMPILA - método comum, é abstract por padrão, mesmo que de forma implícita

    abstract String correrExtremo(); // COMPILA - método comum, declarado abstract de forma explícita
    
    abstract static double calculeVelocidade(int d, int t) { // NÃO COMPILA - método static não pode ser declarado abstract
      return d / t;
    }
  }
  // end::code[]
}
