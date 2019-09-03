package org.j6toj8.fileio.recursiveaccess;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Recursive_VisitorTerminate {

  // tag::code[]
  static class MeuFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      System.out.println("Arquivo visitado: " + file + ". Tamanho: " + attrs.size());
      if (file.getFileName().toString().equals("arquivo122.txt")) {
        System.out.println("Arquivo encontrado. Finalizando.");
        return FileVisitResult.TERMINATE; // finaliza o acesso à árvore de arquivos
      }
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
