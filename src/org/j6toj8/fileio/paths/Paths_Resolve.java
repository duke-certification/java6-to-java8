package org.j6toj8.fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Resolve {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    System.out.println();
    
    Path path1 = Paths.get(userHome, "arquivos");
    Path path2 = Paths.get("arquivo1.txt");
    System.out.println("Absoluto + Relativo: " + path1.resolve(path2));
    System.out.println("Relativo + Absoluto: " + path2.resolve(path1));
    System.out.println("Absoluto + Absoluto: " + path1.resolve(path1));
    System.out.println("Relativo + Relativo: " + path2.resolve(path2));
    // end::code[]
  }

}
