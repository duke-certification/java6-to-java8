package org.j6toj8.fileio.recursiveaccess;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Recursive_SimpleFileVisitor {

  // tag::code[]
  // Implementação simples de um SimpleFileVisitor
  static class MeuFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      // Método que será invocado a cada arquivo encontrado
      System.out.println("Arquivo visitado: " + file + ". Tamanho: " + attrs.size());
      return FileVisitResult.CONTINUE; // instrui o FileVisitor a continuar seguindo a árvore de arquivos
    }
  }
  
  public static void main(String[] args) {
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "arquivos");
    System.out.println("Path: " + path);
    try {
      // Utilização da classe MeuFileVisitor para acessar
      // todos os arquivos no diretório e seus subdiretórios
      Files.walkFileTree(path, new MeuFileVisitor());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  // end::code[]

}
