package org.j6toj8.fileio.recursiveaccess;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Recursive_VisitorDirectory {

  // tag::code[]
  static class MeuFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      System.out.println("Arquivo visitado: " + file + ". Tamanho: " + attrs.size());
      return FileVisitResult.CONTINUE;
    }
    
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
      // Ação que será executada antes de visitar um diretório
      if (dir.getFileName().toString().equals("subpasta12")) {
        return FileVisitResult.SKIP_SUBTREE; // ignora o diretório subpasta12
      }
      return FileVisitResult.CONTINUE;
    }
    
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
      // Ação que será executada depois de visitar um diretório
      return FileVisitResult.CONTINUE;
    }
    
  }
  
  public static void main(String[] args) {
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "arquivos");
    System.out.println("Path: " + path);
    try {
      Files.walkFileTree(path, new MeuFileVisitor());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  // end::code[]

}
