package org.j6toj8.fileio.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_CopyFromPath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Utilizando um nome aleatório de arquivo,
    // apenas para o exemplo executar inúmeras vezes sem problemas
    String nomeAleatorio = "copia" + new Random().nextInt() + ".txt";
    
    try (FileOutputStream fos = new FileOutputStream(userHome + File.separator + nomeAleatorio)) {
      Path pathParaCopia = Paths.get(userHome, "arquivo1.txt");
      Files.copy(pathParaCopia, fos);
      
      Path pathCriado = Paths.get(userHome, nomeAleatorio);
      System.out.println("Path criado: " + pathCriado);
      System.out.println("Path criado existe?: " + Files.exists(pathCriado));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
