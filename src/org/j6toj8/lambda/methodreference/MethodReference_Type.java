package org.j6toj8.lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Type {

  public static void main(String[] args) {
    // tag::code[]
    // representação com expressão lambda
    Function<Integer, Double> intParaDouble1 = x -> x.doubleValue();
    // representação com referência ao método doubleValue
    Function<Integer, Double> intParaDouble2 = Integer::doubleValue;

    // os resultados serão iguais
    System.out.println(intParaDouble1.apply(8));
    System.out.println(intParaDouble2.apply(8));
    // end::code[]
  }
  
}
