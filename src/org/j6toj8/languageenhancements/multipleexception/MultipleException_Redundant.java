package org.j6toj8.languageenhancements.multipleexception;

import java.util.ConcurrentModificationException;

public class MultipleException_Redundant {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (RuntimeException | IllegalArgumentException e) { // NÃO COMPILA - IllegalArgumentException herda de RuntimeException, logo seria redundante
        System.out.println("Exceção capturada: " + e);
    }
  }
  // end::code[]
  
}
