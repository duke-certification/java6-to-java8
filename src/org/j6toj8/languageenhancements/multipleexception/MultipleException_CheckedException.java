package org.j6toj8.languageenhancements.multipleexception;

import java.io.IOException;

public class MultipleException_CheckedException {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (NullPointerException | IOException e) { // NÃO COMPILA - IOException não é lançada dentro do bloco try
        System.out.println("Exceção capturada: " + e);
    }
  }
  // end::code[]
}
