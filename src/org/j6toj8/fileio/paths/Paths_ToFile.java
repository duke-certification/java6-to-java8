package org.j6toj8.fileio.paths;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_ToFile {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path = Paths.get(userHome, "arquivoQueNaoExiste.txt");
    System.out.println("Path: " + path);
    
    File file = path.toFile();
    System.out.println("File: " + file);
    // end::code[]
  }

}
