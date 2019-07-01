package org.j6toj8.lambda.lambdaexpression;

public class LambdaExpression_Ambiguity {

  // tag::code[]
  @FunctionalInterface
  interface Corredor {
    void corra();
  }

  @FunctionalInterface
  interface Piloto {
    void corra();
  }

  static class Executor {
    void execute(Corredor corredor) {
      corredor.corra();
    }

    String execute(Piloto piloto) {
      piloto.corra();
      return "correndo";
    }
  }

  public static void main(String[] args) {
    Executor executor = new Executor();
    // NÃO COMPILA - não é possível determinar o tipo da expressão lambda abaixo
    executor.execute(() -> System.out.println("execute"));
  }
  // end::code[]
}
