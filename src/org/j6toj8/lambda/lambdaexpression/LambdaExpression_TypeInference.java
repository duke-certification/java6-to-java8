package org.j6toj8.lambda.lambdaexpression;

public class LambdaExpression_TypeInference {

  // tag::code[]
  @FunctionalInterface
  interface Executavel {
    void execute(); // método funcional sem argumentos
  }

  @FunctionalInterface
  interface Application {
    String run(); // método funcional também sem argumentos
  }

  static class Executor {
    // esse método pode receber uma expressão lambda sem argumentos
    void rode(Executavel executavel) {
      executavel.execute();
    }

    // esse método também pode receber uma expressão lambda sem argumentos
    void rode(Application application) {
      application.run();
    }
  }

  public static void main(String[] args) {
    Executor executor = new Executor();
    executor.rode(() -> { return "executando"; }); // irá chamar o execute que recebe uma Application
    executor.rode(() -> { System.out.println("executando"); }); // irá chamar o execute que recebe um Executavel
  }
  // end::code[]
}
