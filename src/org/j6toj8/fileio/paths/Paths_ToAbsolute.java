package org.j6toj8.fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_ToAbsolute {

  public static void main(String[] args) {
    // tag::code[]
    Path path = Paths.get("arquivos");
    System.out.println(path);
    System.out.println("É absoluto? " + path.isAbsolute());
    
    System.out.println();
    
    Path absolutePath = path.toAbsolutePath();
    System.out.println(absolutePath);
    System.out.println("É absoluto? " + absolutePath.isAbsolute());
    // end::code[]
  }

}
