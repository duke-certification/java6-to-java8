package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Random;

public class Files_LastModified {

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
      Files.createFile(path);
      System.out.println("Data de Modificação: " + Files.getLastModifiedTime(path));
      FileTime fileTime = FileTime.from(Instant.now().plusMillis(10000));
      Files.setLastModifiedTime(path, fileTime);
      System.out.println("Data de Modificação: " + Files.getLastModifiedTime(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
