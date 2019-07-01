package org.j6toj8.lambda.lambdaexpression;

public class LambdaExpression_TypeInference {

  // tag::code[]
  @FunctionalInterface
  interface Corredor {
    void corra();
  }

  @FunctionalInterface
  interface Piloto {
    String corra();
  }

  static class Executor {
    void execute(Corredor corredor) {
      corredor.corra();
    }

    String execute(Piloto piloto) {
      return piloto.corra();
    }
  }

  public static void main(String[] args) {
    Executor executor = new Executor();
    String s = executor.execute(() -> "execute");
  }
  // end::code[]
}
