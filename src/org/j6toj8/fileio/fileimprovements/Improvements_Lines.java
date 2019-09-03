package org.j6toj8.fileio.fileimprovements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Improvements_Lines {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "arquivos", "subpasta1", "arquivo11.txt");
    System.out.println("Path: " + path);

    try {
      System.out.println("\nConteúdo do arquivo: ");
      Files.lines(path) // recupera todas as linhas do arquivo como Stream
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      System.out.println("\nConteúdo do arquivo maior que 2: ");
      Files.lines(path)
        .filter(s -> Integer.parseInt(s) > 2) // filtra maior que 2
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
