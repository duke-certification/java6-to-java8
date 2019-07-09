package org.j6toj8.lambda.lambdaexpression;

public class LambdaExpression_FunctionalInterface {

  // tag::code[]
  @FunctionalInterface
  interface Executavel { // interface funcional
    String execute(); // método funcional
  }

  private static void executeEApresenteMensagem(Executavel executavel) {
    String mensagem = executavel.execute();
    System.out.println(mensagem);
  }

  public static void main(String[] args) {

    // com classe anônima
    executeEApresenteMensagem(new Executavel() {
      @Override
      public String execute() {
        return "executei com classe anônima";
      }
    });

    // com expressão lambda
    executeEApresenteMensagem(() -> { return "executei com expressão lambda"; });
  }
  // end::code[]
}
