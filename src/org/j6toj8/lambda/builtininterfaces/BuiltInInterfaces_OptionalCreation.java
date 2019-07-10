package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalCreation {

  // tag::code[]
  // Exemplo de método sem Optional
  private static String recupereNomeMes(int mes) {
    if (mes == 1) {
      return "Janeiro";
    } else {
      return null;
    }
  }
  
  // Exemplo de método retornando Optional
  private static Optional<String> recupereNomeMesOptional(int mes) {
    if (mes == 1) {
      return Optional.of("Janeiro"); // cria Optional com valor
    } else {
      return Optional.empty(); // cria Optional vazio
    }
  }
  
  public static void main(String[] args) {
    String nomeMes1 = recupereNomeMes(1);
    if (nomeMes1 != null) { // valida se o valor existe através da tradicional comparação '!= null'
      System.out.println(nomeMes1);
    }
    
    Optional<String> nomeMes2 = recupereNomeMesOptional(1);
    if (nomeMes2.isPresent()) { // valida se o Optional possui um valor preenchido
      System.out.println(nomeMes2.get()); // recupera o valor dentro do Optional
    }
  }
  // end::code[]
  
}
