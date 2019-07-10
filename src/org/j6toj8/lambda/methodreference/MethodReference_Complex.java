package org.j6toj8.lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Complex {

  public static void main(String[] args) {
    // tag::code[]
    Function<String, Integer> stringParaInteger1 = s -> new Integer(s + "2");
    System.out.println(stringParaInteger1.apply("1"));
    // end::code[]
  }
  
}
