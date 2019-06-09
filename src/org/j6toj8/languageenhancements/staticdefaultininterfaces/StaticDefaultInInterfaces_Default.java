package org.j6toj8.languageenhancements.staticdefaultininterfaces;

import java.io.IOException;

public class StaticDefaultInInterfaces_Default {

  // tag::code[]
  interface Corredor {
    default String correr() {
      return "Correndo";
    }
  }
  
  static class Pessoa implements Corredor {
    
  }
  
  static class Cavalo implements Corredor {
    @Override
    public String correr() {
      return "Galopando";
    }
    
    public static void main(String[] args) throws IOException {
      System.out.println(new Pessoa().correr()); 
      System.out.println(new Cavalo().correr());
    }
  }
  // end::code[]
}
