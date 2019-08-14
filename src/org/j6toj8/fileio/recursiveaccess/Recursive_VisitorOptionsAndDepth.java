package org.j6toj8.fileio.recursiveaccess;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

public class Recursive_VisitorOptionsAndDepth {

  // tag::code[]
  static class MeuFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      System.out.println("Arquivo visitado: " + file);
      return FileVisitResult.CONTINUE;
    }
  }
  
  public static void main(String[] args) {
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "arquivos");
    System.out.println("Path: " + path);
    try {
      HashSet<FileVisitOption> opcoes = new HashSet<FileVisitOption>();
      opcoes.add(FileVisitOption.FOLLOW_LINKS);
      
      // visita a árvore com limite de profundidade 2
      // e com a opção de também visitar links simbólicos
      Files.walkFileTree(path, opcoes, 2, new MeuFileVisitor());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  // end::code[]

}
