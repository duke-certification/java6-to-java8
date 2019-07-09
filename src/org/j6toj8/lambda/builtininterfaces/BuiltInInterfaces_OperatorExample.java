package org.j6toj8.lambda.builtininterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BuiltInInterfaces_OperatorExample {

  // tag::code[]
  public static void main(String[] args) {
    UnaryOperator<Integer> somaDois = x -> x + 2;
    System.out.println(somaDois.apply(7)); // soma 7 + 2

    BinaryOperator<Integer> somaNumeros = (x, y) -> x + y;
    System.out.println(somaNumeros.apply(1, 5)); // soma 1 + 5
  }
  // end::code[]

}
