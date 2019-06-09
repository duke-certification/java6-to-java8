package org.j6toj8.languageenhancements.trywithresources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class TryWithResouces_Complete {

  // tag::code[]
  public static void main(String[] args) throws IOException {
    // criação de 2 arquivos
    File file = new File("arquivo.txt");
    File file2 = new File("arquivo2.txt");
    
    // Exemplo try-with-resources com PrintWriter
    try (PrintWriter writer = new PrintWriter(file)) {
      // escreve no arquivo.txt
      writer.println("Olá Mundo!");
    }
    
    // Exemplo try-with-resources com BufferedReader
    try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
      // imprime no console uma linha do arquivo.txt
      System.out.println(reader.readLine());
    }
    
    // Exemplo try-with-resources com BufferedReader e BufferedWriter
    try (BufferedReader reader = Files.newBufferedReader(file.toPath());
       BufferedWriter writer = Files.newBufferedWriter(file2.toPath())) {
      // lê a linha do arquivo.txt e escreve no arquivo2.txt
      writer.write(reader.readLine() + "2");
    }
    
    // Exemplo try-with-resources com BufferedReader
    try (BufferedReader reader = Files.newBufferedReader(file2.toPath())) {
      // imprime no console uma linha do arquivo2.txt
      System.out.println(reader.readLine());
    }
    // todos os Reader e Writer já foram fechados.
  }
  // end::code[]
}
