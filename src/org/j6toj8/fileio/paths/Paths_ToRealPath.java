package org.j6toj8.fileio.paths;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_ToRealPath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path pathQueExiste = Paths.get(userHome, "arquivo1.txt");
    Path pathQueNaoExiste = Paths.get(userHome, "arquivoQueNaoExiste.txt");
    
    try {
      Path realPath = pathQueExiste.toRealPath();
      System.out.println("realPath: " + realPath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      pathQueNaoExiste.toRealPath(); // LANÇA EXCEÇÃO
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
