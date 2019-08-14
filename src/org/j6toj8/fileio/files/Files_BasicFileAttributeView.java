package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class Files_BasicFileAttributeView {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path = Paths.get(userHome, "arquivo.txt");
    
    try {
      BasicFileAttributeView attributesView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
      BasicFileAttributes attributesAntigos = attributesView.readAttributes();
      
      System.out.println("\nData de Criação original: " + attributesAntigos.creationTime());
      System.out.println("Último acesso original: " + attributesAntigos.lastAccessTime());
      System.out.println("Última modificação original: " + attributesAntigos.lastModifiedTime());
      
      FileTime fileTime = FileTime.from(Instant.now().plusMillis(10000));
      attributesView.setTimes(fileTime, fileTime, fileTime);
      
      BasicFileAttributes attributesNovos = attributesView.readAttributes();
      System.out.println("\nData de Criação alterada: " + attributesNovos.creationTime());
      System.out.println("Último acesso alterada: " + attributesNovos.lastAccessTime());
      System.out.println("Última modificação alterada: " + attributesNovos.lastModifiedTime());
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
