package org.j6toj8.streams.usingstreams;

import java.util.stream.Stream;

public class Streams_Match {

  public static void main(String[] args) {
    // tag::code[]
    boolean anyMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
        .anyMatch(e -> e > 5); // vefifica se algum elemento é maior que 5
    System.out.println("anyMatch: " + anyMatch);

    boolean allMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
        .allMatch(e -> e > 5); // vefifica se TODOS os elementos são maiores que 5
    System.out.println("allMatch: " + allMatch);
    
    boolean noneMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
        .noneMatch(e -> e > 5); // vefifica NENHUM elemento é maior que 5
    System.out.println("noneMatch: " + noneMatch);

    // end::code[]
  }
}
