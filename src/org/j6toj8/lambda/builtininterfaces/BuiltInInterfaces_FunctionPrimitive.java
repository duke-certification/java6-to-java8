package org.j6toj8.lambda.builtininterfaces;

import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class BuiltInInterfaces_FunctionPrimitive {

  // tag::code[]
  public static void main(String[] args) {
    IntToDoubleFunction duplica = x -> x * 2.5;
    System.out.println(duplica.applyAsDouble(3)); // multiplica 3 * 2.5

    ToDoubleBiFunction<Integer, Integer> multiplicaEDuplica = (x, y) -> x * y * 2.5;
    System.out.println(multiplicaEDuplica.applyAsDouble(3, 4)); // multiplica 3 * 4 * 2.5
  }
  // end::code[]

}
