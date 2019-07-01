package org.j6toj8.lambda.lambdaexpression;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class LambdaExpression_Shadowing {

  // tag::code[]
  public static void main(String[] args) {
    Double x = 2.0; // variável 'x' no método

    // NÃO COMPILA - a variável com nome 'x' já existe e não pode ser declarada nas variáveis da expressão lambda
    BinaryOperator<Double> elevarAoX = (Double y, Double x) -> Math.pow(y, x);
    
    // NÃO COMPILA - a variável com nome 'x' já existe e não pode ser declarada no corpo da expressão lambda
    UnaryOperator<Double> elevarAoQuadrado = (Double y) -> {
      Double x = 2.0;
      return Math.pow(y, x);
    };
  }
  // end::code[]
}
