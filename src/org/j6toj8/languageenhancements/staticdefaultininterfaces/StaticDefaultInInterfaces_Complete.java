package org.j6toj8.languageenhancements.staticdefaultininterfaces;

import java.io.IOException;

public class StaticDefaultInInterfaces_Complete {

  // tag::code[]
  interface Corredor {
    static double calculeVelocidade(int distancia, int tempo) {
      return distancia / tempo;
    }
    
    default String correr() {
      return "Correndo";
    }
    
    String correrRapido();
  }
  
  static class Pessoa implements Corredor {
    @Override
    public String correrRapido() {
      return "Pessoa Correndo Rápido";
    }
    
    public static void main(String[] args) throws IOException {
      System.out.println(Corredor.calculeVelocidade(100, 10));
      System.out.println(new Pessoa().correr());
      System.out.println(new Pessoa().correrRapido());
    }
  }
  // end::code[]
}
