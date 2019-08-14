package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Files_BasicFileAttributes {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path = Paths.get(userHome, "arquivo.txt");
    
    try {
      BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
      System.out.println("Tamanho: " + attributes.size());
      
      System.out.println("É diretório? " + attributes.isDirectory());
      System.out.println("É link simbólico? " + attributes.isSymbolicLink());
      System.out.println("É um arquivo comum? " + attributes.isRegularFile());
      System.out.println("Não é nenhuma das opções acima? " + attributes.isOther());
      
      System.out.println("Data de Criação: " + attributes.creationTime());
      System.out.println("Último acesso: " + attributes.lastAccessTime());
      System.out.println("Última modificação: " + attributes.lastModifiedTime());
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
