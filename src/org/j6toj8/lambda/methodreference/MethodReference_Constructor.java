package org.j6toj8.lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    // representação com expressão lambda
    Function<String, Integer> stringParaInteger1 = s -> new Integer(s);
    // representação com referência ao construtor
    Function<String, Integer> stringParaInteger2 = Integer::new;

    // os resultados serão iguais
    System.out.println(stringParaInteger1.apply("1"));
    System.out.println(stringParaInteger2.apply("1"));
    // end::code[]
  }
  
}
