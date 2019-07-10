package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalOrElseThrow {

  // tag::code[]
  public static void main(String[] args) {
    Optional<String> optionalVazio = Optional.empty();
    Optional<String> optionalComValor = Optional.of("valor");

    // Nesse caso será impresso o valor presente em Optional, pois ele está preenchido
    String orElseThrow1 = optionalComValor.orElseThrow(() -> new RuntimeException());
    System.out.println(orElseThrow1);
    
    // Nesse caso será lançada exceção, pois o Optional não está preenchido
    String orElseThrow2 = optionalVazio.orElseThrow(() -> new RuntimeException());
  }
  // end::code[]

}
