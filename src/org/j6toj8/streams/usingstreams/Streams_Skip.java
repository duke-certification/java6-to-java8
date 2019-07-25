package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_Skip {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 4) // stream de 0 a 3
      .skip(2) // ignora 2 elementos
      .forEach(System.out::println); // imprime os elementos
    // end::code[]
  }
}
