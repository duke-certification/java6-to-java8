package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_Suppressed {
  
  // tag::code[]
  static class Porta implements AutoCloseable {
    @Override
    public void close() {
      System.out.println("close");
      throw new RuntimeException("erro no close"); // lança RuntimeException, mas só depois do try
    }
  }
  
  public static void main(String[] args) {
    try (Porta porta = new Porta()) {
      System.out.println("try");
      throw new RuntimeException("erro no try"); // lança RuntimeException
    } catch (RuntimeException e) { // captura RuntimeException - qual foi capturada?
      System.out.println(e.getMessage()); // apresenta a mensagem da exceção do try
      System.out.println(e.getSuppressed()[0].getMessage()); // apresenta a mensagem da exceção suprimida, ou seja, do close
    }
  }
  // end::code[]
}
