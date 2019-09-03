package org.j6toj8.fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_SubPath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path = Paths.get(userHome, "arquivos", "arquivo1.txt");
    System.out.println("Path: " + path);
    
    Path subpath1 = path.subpath(0, 1);
    System.out.println(subpath1);
    
    Path subpath2 = path.subpath(0, 2);
    System.out.println(subpath2);
    
    Path subpath3 = path.subpath(1, 3);
    System.out.println(subpath3);
    
    Path subpath4 = path.subpath(2, 4);
    System.out.println(subpath4);
    
    Path subpath5 = path.subpath(3, 5); // EXCEÇÃO, pois só existem 4 elementos no path
    // end::code[]
  }

}
