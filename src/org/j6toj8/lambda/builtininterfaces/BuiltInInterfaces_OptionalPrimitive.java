package org.j6toj8.lambda.builtininterfaces;

import java.util.OptionalInt;

public class BuiltInInterfaces_OptionalPrimitive {

  public static void main(String[] args) {
    // tag::code[]
    OptionalInt optionalComValor = OptionalInt.of(5);
    OptionalInt optionalVazio = OptionalInt.empty();

    if (optionalComValor.isPresent()) {
      System.out.println(optionalComValor.getAsInt());
    }
    if (optionalVazio.isPresent()) {
      System.out.println(optionalVazio.getAsInt());
    }
    // end::code[]
  }

}
