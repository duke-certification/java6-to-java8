package org.j6toj8.streams.usingstreams;

import java.util.Arrays;

public class Streams_Sorted {

  public static void main(String[] args) {
    // tag::code[]
    // Criação de um array comum de Strings
    String[] array = new String[] { "G", "T", "Y", "A", "B", "C", "A", "B", "F" };
    
    Arrays.stream(array)
        .sorted() // ordena utilizando a ordem natural
        .forEach(System.out::println);
    // end::code[]
  }
}
