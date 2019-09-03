package org.j6toj8.fileio.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_CopyToPath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Utilizando um nome aleatório de arquivo,
    // apenas para o exemplo executar inúmeras vezes sem problemas
    String nomeAleatorio = "copia" + new Random().nextInt() + ".txt";
    
    try (FileInputStream fis = new FileInputStream(userHome + File.separator + "arquivo1.txt")) {
      Path pathParaCopia = Paths.get(userHome, nomeAleatorio);
      System.out.println("Path 2 existe? " + Files.exists(pathParaCopia));
      Files.copy(fis, pathParaCopia);
      System.out.println("Path 2 existe? " + Files.exists(pathParaCopia));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
