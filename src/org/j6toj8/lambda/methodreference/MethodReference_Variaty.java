package org.j6toj8.lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Variaty {

  public static void main(String[] args) {
    // tag::code[]
    // ATENÇÃO! Todas essas expressões lambda são equivalentes!
    
    Function<Integer, String> lambda1 = (Integer x) -> { return String.valueOf(x); };
    Function<Integer, String> lambda2 = (x) -> { return String.valueOf(x); };
    Function<Integer, String> lambda3 = x -> { return String.valueOf(x); };
    
    Function<Integer, String> lambda4 = (Integer x) -> String.valueOf(x);
    Function<Integer, String> lambda5 = (x) -> String.valueOf(x);
    Function<Integer, String> lambda6 = x -> String.valueOf(x);
    
    Function<Integer, String> lambda7 = String::valueOf;
    // end::code[]
  }
  
}
