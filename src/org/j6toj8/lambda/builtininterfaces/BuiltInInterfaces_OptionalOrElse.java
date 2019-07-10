package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalOrElse {

  // tag::code[]
  public static void main(String[] args) {
    // Exemplo com Optional vazio
    Optional<String> optionalVazio = Optional.empty();

    // as duas variáveis abaixo terão a String "valor padrao", pois o optional está vazio
    String orElse = optionalVazio.orElse("valor padrao"); // obtém a String diretamente
    String orElseGet = optionalVazio.orElseGet(() -> { return "valor padrao"; }); // obtém a String através da expressão lambda
    
    System.out.println(orElse);
    System.out.println(orElseGet);
    
    // Exemplo com Optional com valor
    Optional<String> optionalComValor = Optional.of("valor");

    // as duas variáveis abaixo irão utilizar o valor presente no optional, pois ele já está preenchido
    String orElse2 = optionalComValor.orElse("valor padrao");
    String orElseGet2 = optionalComValor.orElseGet(() -> { return "valor padrao"; });
    
    System.out.println(orElse2);
    System.out.println(orElseGet2);
  }
  // end::code[]

}
