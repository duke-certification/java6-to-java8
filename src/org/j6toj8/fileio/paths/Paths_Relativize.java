package org.j6toj8.fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Relativize {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    System.out.println();
    
    Path pathAbsoluto1 = Paths.get(userHome, "arquivos");
    Path pathAbsoluto2 = Paths.get(userHome, "arquivos/arquivo1.txt");
    System.out.println("Absoluto 1: " + pathAbsoluto1);
    System.out.println("Absoluto 2: " + pathAbsoluto2);
    
    Path pathRelativo1 = Paths.get("arquivo1.txt");
    Path pathRelativo2 = Paths.get("arquivos/arquivo1.txt");
    System.out.println("Relativo 1: " + pathRelativo1);
    System.out.println("Relativo 2: " + pathRelativo2);
    
    System.out.println("Absoluto 1 + Absoluto 2: " + pathAbsoluto1.relativize(pathAbsoluto2));
    System.out.println("Absoluto 2 + Absoluto 1: " + pathAbsoluto2.relativize(pathAbsoluto1));
    
    System.out.println("Relativo 1 + Relativo 2: " + pathRelativo1.relativize(pathRelativo2));
    System.out.println("Relativo 2 + Relativo 1: " + pathRelativo2.relativize(pathRelativo1));
    
    try {
      // Exceção será lançada, pois não é possível chamar relativize em tipos diferente de Path
      System.out.println("Absoluto + Relativo: " + pathAbsoluto1.relativize(pathRelativo1));
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    try {
      // Exceção será lançada, pois não é possível chamar relativize em tipos diferente de Path      
      System.out.println("Relativo + Absoluto: " + pathRelativo1.relativize(pathAbsoluto1));
    } catch (Exception e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
