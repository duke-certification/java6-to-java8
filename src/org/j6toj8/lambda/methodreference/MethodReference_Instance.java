package org.j6toj8.lambda.methodreference;

import java.util.function.BiFunction;

public class MethodReference_Instance {

  // tag::code[]
  static class Conversor {
    public String converte(Integer x, Integer y) {
      return String.valueOf(x) + " - " + String.valueOf(y);
    }
  }
  
  public static void main(String[] args) {
    Conversor conversor = new Conversor(); // instância da classe Conversor
    
    // representação com expressão lambda
    BiFunction<Integer, Integer, String> converte1 = (x, y) -> conversor.converte(x, y);
    // representação com referência ao método da instância
    BiFunction<Integer, Integer, String> converte2 = conversor::converte;

    // os resultados serão iguais
    System.out.println(converte1.apply(5, 8));
    System.out.println(converte2.apply(5, 8));
  }
  // end::code[]
  
}
