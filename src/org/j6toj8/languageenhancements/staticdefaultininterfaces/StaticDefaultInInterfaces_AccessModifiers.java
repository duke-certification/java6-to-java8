package org.j6toj8.languageenhancements.staticdefaultininterfaces;

import java.io.IOException;

public class StaticDefaultInInterfaces_AccessModifiers {

  // tag::code[]
  interface Corredor {
    default String correr() { // COMPILA - não há modificador de acesso declarado, é automaticamente público
      return "Correndo";
    }
    public default String correrRapido() { // COMPILA - modificador de acesso público explícito
      return "Correndo Rápido";
    }
    protected default String correrDevagar() { // NÃO COMPILA - o método deve ser obrigatoriamente público
      return "Correndo Devagar";
    }
    private default String correrExtremo() { // NÃO COMPILA - o método deve ser obrigatoriamente público
      return "Correndo ao Extremo";
    }
    
    private static double calculeVelocidade(int d, int t) { // NÃO COMPILA - o método deve ser obrigatoriamente público
      return d / t;
    }
  }
  // end::code[]
}
