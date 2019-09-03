package org.j6toj8.fileio.paths;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Creation {

  public static void main(String[] args) {
    // tag::code[]
    // diretório padrão do usuário
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // path absoluto
    Path path1 = Paths.get("/home/rinaldo");
    System.out.println("Path 1: " + path1);

    // path absoluto dividido em strings
    Path path2 = Paths.get("/", "home", "rinaldo");
    System.out.println("Path 2: " + path2);

    // path absoluto a partir do userHome
    Path path3 = Paths.get(userHome);
    System.out.println("Path 3: " + path3);

    // path absoluto para um arquivo
    Path path4 = Paths.get("/home/rinaldo/arquivos/arquivo.txt");
    System.out.println("Path 4: " + path4);

    // path absoluto para um arquivo a partir do userHome
    Path path5 = Paths.get(userHome, "arquivos", "arquivo.txt");
    System.out.println("Path 5: " + path5);

    // path absoluto em um sistema windows
    Path path6 = Paths.get("C:/users/rinaldo");
    System.out.println("Path 6: " + path6);

    // path absoluto windows divido em strings
    Path path7 = Paths.get("C:", "users", "rinaldo");
    System.out.println("Path 7: " + path7);

    // path relativo
    Path path8 = Paths.get("rinaldo");
    System.out.println("Path 8: " + path8);

    // path a partir de uma URI
    Path path9 = Paths.get(URI.create("file:///home/rinaldo/arquivos/arquivo.txt"));
    System.out.println("Path 9: " + path9);
    
    // path sem utilizar a classe Paths - produz o mesmo resultado
    Path path10 = FileSystems.getDefault().getPath("/home/rinaldo");
    System.out.println("Path 10: " + path10);
    // end::code[]
  }

}
