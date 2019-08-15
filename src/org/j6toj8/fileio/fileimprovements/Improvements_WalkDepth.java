package org.j6toj8.fileio.fileimprovements;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Improvements_WalkDepth {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "arquivos");
    System.out.println("Path: " + path);

    try {
      System.out.println("\nArquivos e Links simbólicos até o segundo nível: ");
      Files.walk(path, 2, FileVisitOption.FOLLOW_LINKS)
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // end::code[]
  }

}
