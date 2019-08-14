package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_CreateDirectories {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Utilizando um nome aleatório de diretório,
    // apenas para o exemplo executar inúmeras vezes sem problemas
    String nomeAleatorio1 = "arquivo" + new Random().nextInt();
    String nomeAleatorio2 = "arquivo" + new Random().nextInt();
    String nomeAleatorio3 = "arquivo" + new Random().nextInt();
    
    Path path = Paths.get(userHome, nomeAleatorio1, nomeAleatorio2, nomeAleatorio3);
    System.out.println("Path: " + path);

    try {
      Files.createDirectory(path); // MÉTODO ERRADO, LANÇA EXCEÇÃO
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      System.out.println("Path existe? " + Files.exists(path));
      Files.createDirectories(path);
      System.out.println("Path existe? " + Files.exists(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
