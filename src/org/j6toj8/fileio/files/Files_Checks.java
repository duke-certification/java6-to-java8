package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_Checks {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path1 = Paths.get(userHome, "arquivo1.txt");
    Path path2 = Paths.get(userHome, "arquivos");
    
    System.out.println("Path 1: " + path1);
    System.out.println("Path 2: " + path2);
    
    System.out.println("Path 1 existe? " + Files.exists(path1));
    System.out.println("Path 2 existe? " + Files.exists(path2));
    
    System.out.println("Path 1 NÃO existe? " + Files.notExists(path1));
    System.out.println("Path 2 NÃO existe? " + Files.notExists(path2));
    
    System.out.println("Path 1 é um diretório? " + Files.isDirectory(path1));
    System.out.println("Path 1 é um arquivo comum? " + Files.isRegularFile(path1));
    System.out.println("Path 1 é um link simbólico? " + Files.isSymbolicLink(path1));
    
    System.out.println("Aplicação possui permissão de leitura no Path 1? " + Files.isReadable(path1));
    System.out.println("Aplicação possui permissão de escrita no Path 1? " + Files.isWritable(path1));
    System.out.println("Aplicação possui permissão de execução no Path 1? " + Files.isExecutable(path1));

    try {
      System.out.println("Qual o tamanho de Path 1? " + Files.size(path1));
    } catch (IOException e1) {
      // Lança exceção se o arquivo não existir
      e1.printStackTrace();
    }
    
    try {
      System.out.println("Path 1 é oculto? " + Files.isHidden(path1));
    } catch (IOException e) {
      // Lança exceção se o arquivo não existir
      e.printStackTrace();
    }
    
    try {
      System.out.println("Path 1 e Path 1 são iguais? " + Files.isSameFile(path1, path1));
    } catch (IOException e) {
      // Lança exceção se o arquivo não existir      
      e.printStackTrace();
    }
    
    // end::code[]
  }

}
