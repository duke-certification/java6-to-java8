package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalIfPresent {

  // tag::code[]
  public static void main(String[] args) {
    Optional<String> optionalVazio = Optional.empty();
    Optional<String> optionalComValor = Optional.of("valor");
    
    // A linha abaixo não irá imprimir nada, pois o optional está vazio
    optionalVazio.ifPresent(valor -> System.out.println("Vazio: " + valor));
    // A linha abaixo irá imprimir, pois o optional possui valor
    optionalComValor.ifPresent(valor -> System.out.println("Com Valor: " + valor ));
  }
  // end::code[]
  
}
