package org.j6toj8.lambda.lambdaexpression;

public class LambdaExpression_AnonymousClass {

  public static void main(String[] args) {
    // tag::code[]
    // com classe anônima
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Executando.");
      }
    }).run();

    // com expressão lambda
    new Thread(() -> System.out.println("Executando.")).run();
    // end::code[]
  }
}
