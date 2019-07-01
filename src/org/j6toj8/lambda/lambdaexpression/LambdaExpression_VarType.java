package org.j6toj8.lambda.lambdaexpression;

import java.util.function.UnaryOperator;

public class LambdaExpression_VarType {

  public static void main(String[] args) {
    // tag::code[]
    // NÃO COMPILA - caso o tipo de um dos parâmetros for informado, é necessário informar de todos eles
    UnaryOperator<Double> elevarAoX = (Double y, x) -> Math.pow(y, x);
    
    // COMPILA - todos os parâmetros com tipos informados
    UnaryOperator<Double> elevarAoX2 = (Double y, Double x) -> Math.pow(y, x);
    // end::code[]
  }
}
