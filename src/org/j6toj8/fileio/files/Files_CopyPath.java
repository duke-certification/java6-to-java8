package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_CopyPath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Utilizando um nome aleatório de arquivo,
    // apenas para o exemplo executar inúmeras vezes sem problemas
    String nomeAleatorio = "arquivo" + new Random().nextInt() + ".txt";
    
    Path path1 = Paths.get(userHome, nomeAleatorio);
    Path path2 = Paths.get(userHome, nomeAleatorio + "-copia.txt");
    System.out.println("Path 1: " + path1);
    System.out.println("Path 2: " + path2);
    
    try {
      System.out.println("Path 1 existe? " + Files.exists(path1));
      Files.createFile(path1);
      System.out.println("Path 1 existe? " + Files.exists(path1));
      System.out.println("Path 2 existe? " + Files.exists(path2));
      Files.copy(path1, path2);
      System.out.println("Path 2 existe? " + Files.exists(path2));
    } catch (IOException e) {
      e.printStackTrace();
    }

    // end::code[]
  }

}
