package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_DeletePath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Utilizando um nome aleatório de arquivo,
    // apenas para o exemplo executar inúmeras vezes sem problemas
    String nomeAleatorio = "arquivo" + new Random().nextInt() + ".txt";
    
    Path path = Paths.get(userHome, nomeAleatorio);
    System.out.println("Path: " + path);

    try {
      System.out.println("Path existe? " + Files.exists(path));
      Files.createFile(path);
      System.out.println("Path existe? " + Files.exists(path));
      
      Files.delete(path); // tenta apagadar o Path e lança exceção se ele não existir
      System.out.println("Path existe? " + Files.exists(path));
      
      Files.deleteIfExists(path); // tenta apagadar o Path e não faz nada se ele não existir
      System.out.println("Path existe? " + Files.exists(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    // end::code[]
  }

}
