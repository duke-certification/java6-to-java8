package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_Filter {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 4) // stream de 0 a 3
      .filter(e -> e % 2 == 0) // limita a números pares (resto da divisão por 2 é 0)
      .forEach(System.out::println); // imprime os elementos
    // end::code[]
  }
}
