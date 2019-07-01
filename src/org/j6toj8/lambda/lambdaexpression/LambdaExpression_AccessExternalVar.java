package org.j6toj8.lambda.lambdaexpression;

import java.util.function.UnaryOperator;

public class LambdaExpression_AccessExternalVar {

  // tag::code[]
  public static void main(String[] args) {
    final Double x1 = 2.0;
    Double x2 = 2.0;
    Double x3 = 2.0;

    // COMPILA - variável externa 'x1' é final e pode ser utilizada na expressão lambda
    UnaryOperator<Double> elevarAoX1 = (Double y) -> Math.pow(y, x1);
    
    // COMPILA - variável externa 'x2' não é final, mas nunca é alterada, então pode ser utilizada dentro da expressão lambda
    UnaryOperator<Double> elevarAoX2 = (Double y) -> Math.pow(y, x2);

    // NÃO COMPILA - variável externa 'x3' é alterada dentro desse método, então não pode ser utilizada dentro da expressão lambda
    UnaryOperator<Double> elevarAoX3 = (Double y) -> Math.pow(y, x3);
    
    x3 = 3.0; // alteração da variável x3 não permite que ela seja utilizada em expressões lambda
  }
  // end::code[]
}
