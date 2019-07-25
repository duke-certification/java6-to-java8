package org.j6toj8.streams.usingstreams;

import java.util.Arrays;

public class Streams_Distinct {

  public static void main(String[] args) {
    // tag::code[]
    // Criação de um array comum de Strings
    String[] array = new String[] { "A", "B", "C", "A", "B", "F" };
    
    Arrays.stream(array)
        .distinct() // ignora elementos repetidos
        .forEach(System.out::println);
    // end::code[]
  }
}
