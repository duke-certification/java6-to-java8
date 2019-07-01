package org.j6toj8.lambda.lambdaexpression;

import java.util.function.UnaryOperator;

public class LambdaExpression_SimpleComplete {

  public static void main(String[] args) {
    // tag::code[]
    // expressão lambda completa
    UnaryOperator<Double> elevarAoQuadrado1 = (Double x) -> { return Math.pow(x, 2); };
    // expressão lambda simplificada
    UnaryOperator<Double> elevarAoQuadrado2 = (x) -> Math.pow(x, 2);
    // end::code[]
  }
}
