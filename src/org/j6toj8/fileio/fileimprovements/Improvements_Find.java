package org.j6toj8.fileio.fileimprovements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Improvements_Find {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "arquivos");
    System.out.println("Path: " + path);

    try {
      System.out.println("\nTodos os arquivos, ignorando diretórios, até o segundo nível: ");
      // ao chamar o find:
      // primeiro argumento: o path inicial
      // segundo argumento: o limite de profundidade
      // terceiro argumento: expressão lambda para filtrar 
      Files.find(path, 2, (p, a) -> a.isRegularFile())
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
