package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_Map {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 4) // stream de 0 a 3
      .map(e -> e * 2) // multiplica os elementos por 2
      .forEach(System.out::println); // imprime os elementos
    // end::code[]
  }
}
