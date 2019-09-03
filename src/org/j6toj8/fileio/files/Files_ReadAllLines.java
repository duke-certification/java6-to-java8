package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Files_ReadAllLines {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path = Paths.get(userHome, "arquivo.txt");
    try {
      List<String> conteudo = Files.readAllLines(path);
      System.out.println(conteudo);
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
