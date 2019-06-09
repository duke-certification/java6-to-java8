package org.j6toj8.languageenhancements.staticdefaultininterfaces;

import java.io.IOException;

public class StaticDefaultInInterfaces_Static {

  // tag::code[]
  interface Corredor {
    static double calculeVelocidade(int distancia, int tempo) {
      return distancia / tempo;
    }
  }
  
  static class Pessoa implements Corredor {
    public static void main(String[] args) throws IOException {
      System.out.println(Corredor.calculeVelocidade(100, 50)); // COMPILA - método static de uma interface sendo chamado como se fosse de uma classe comum 
      System.out.println(Pessoa.calculeVelocidade(100, 50)); // NÃO COMPILA - o método static não é herdado, nem implementado, pela classe Pessoa
    }
  }
  // end::code[]
}
