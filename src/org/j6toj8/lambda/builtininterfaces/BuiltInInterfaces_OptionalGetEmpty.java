package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalGetEmpty {

  public static void main(String[] args) {
    // tag::code[]
    Optional<String> optionalComValor = Optional.of("valor");
    System.out.println(optionalComValor.get()); // recupera o valor corretamente

    Optional<String> optionalVazio = Optional.empty();
    System.out.println(optionalVazio.get()); // lança exceção
    // end::code[]
  }

}
