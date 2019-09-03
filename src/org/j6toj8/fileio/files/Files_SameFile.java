package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_SameFile {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path1 = Paths.get(userHome, "arquivo1.txt");
    Path path2 = Paths.get("/", "home", "rinaldo", "arquivo1.txt");
    Path path3 = Paths.get("/home/rinaldo/arquivo1.txt");
    Path path4 = Paths.get("/home/rinaldo/Downloads/../arquivo1.txt");
    
    try {
      // todos os Path são iguais
      System.out.println("Path 1 e Path 2 são iguais? " + Files.isSameFile(path1, path2));
      System.out.println("Path 2 e Path 3 são iguais? " + Files.isSameFile(path2, path3));
      System.out.println("Path 3 e Path 4 são iguais? " + Files.isSameFile(path3, path4));
      System.out.println("Path 1 e Path 4 são iguais? " + Files.isSameFile(path1, path4));
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    // end::code[]
  }

}
