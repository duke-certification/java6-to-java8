package org.j6toj8.lambda.builtininterfaces;

import java.util.Random;
import java.util.function.IntPredicate;

public class BuiltInInterfaces_PredicatePrimitive {

  // tag::code[]
  public static void main(String[] args) {
    IntPredicate dado = x -> x == new Random().nextInt(7);
    System.out.println(dado.test(1)); // testa se o número gerado é igual a 1
  }
  // end::code[]

}
