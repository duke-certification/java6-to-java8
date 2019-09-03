package org.j6toj8.fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Normalize {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    System.out.println();
    
    Path path1 = Paths.get(userHome, "arquivos/./arquivo1.txt");
    System.out.println("Path: " + path1);
    System.out.println("Path normalize: " + path1.normalize());
    
    System.out.println();
    
    Path path2 = Paths.get(userHome, "arquivos/../arquivo1.txt");
    System.out.println("Path: " + path2);
    System.out.println("Path normalize: " + path2.normalize());
    
    // end::code[]
  }

}
