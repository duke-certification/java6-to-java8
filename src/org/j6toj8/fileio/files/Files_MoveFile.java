package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_MoveFile {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    String nomeAleatorio = "arquivo" + new Random().nextInt() + ".txt";
    
    Path arquivoOrigem = Paths.get(userHome, nomeAleatorio);
    Path arquivoDestino = Paths.get(userHome, nomeAleatorio + "-movido.txt");
    System.out.println("Path Arquivo Origem: " + arquivoOrigem);
    System.out.println("Path Arquivo Destino: " + arquivoDestino);
    
    try {
      System.out.println("Arquivo origem existe? " + Files.exists(arquivoOrigem));
      Files.createFile(arquivoOrigem);
      System.out.println("Arquivo origem existe? " + Files.exists(arquivoOrigem));
      
      System.out.println("Arquivo destino existe? " + Files.exists(arquivoDestino));
      Files.move(arquivoOrigem, arquivoDestino);
      System.out.println("Arquivo destino existe? " + Files.exists(arquivoDestino));
      System.out.println("Arquivo origem existe? " + Files.exists(arquivoOrigem));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
